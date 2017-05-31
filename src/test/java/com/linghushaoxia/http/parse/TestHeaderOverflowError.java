package com.linghushaoxia.http.parse;

import java.nio.*;

import com.linghushaoxia.http.parse.impl.ParserType;

import static com.linghushaoxia.http.parse.Util.*;

public class TestHeaderOverflowError {

  public static void test (ParserType type) {
    HTTPParser parser = new HTTPParser(type);
    ByteBuffer buf    = getBytes(type);
    
    int numbytes = buf.limit();

    parser.execute(Util.SETTINGS_NULL, buf);

    check(numbytes == buf.position());

    buf      = buffer("header-key: header-value\r\n");
    numbytes = buf.limit();
    for (int i = 0; i!= 1000; ++i) {
      parser.execute(Util.SETTINGS_NULL, buf);
      check(numbytes == buf.position());

      buf.rewind();

    }
  }

  static ByteBuffer getBytes (ParserType type) {
    if (ParserType.HTTP_BOTH == type) {
      throw new RuntimeException("only HTTP_REQUEST and HTTP_RESPONSE");
    }

    if (ParserType.HTTP_REQUEST == type) {
      return buffer("GET / HTTP/1.1\r\n"); 
    }
    return buffer("HTTP/1.0 200 OK\r\n");
  }

  public static void test () {
    p(TestHeaderOverflowError.class);
    test(ParserType.HTTP_REQUEST);
    test(ParserType.HTTP_RESPONSE);
  }


}
