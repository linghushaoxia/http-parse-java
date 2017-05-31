package com.linghushaoxia.http.parse;

import java.nio.*;

import com.linghushaoxia.http.parse.impl.ParserType;

import static com.linghushaoxia.http.parse.Util.*;

public class TestNoOverflowLongBody {

  public static void test (ParserType type, int len) {
    HTTPParser parser = new HTTPParser(type);
    ByteBuffer buf    = getBytes(type, len);
    
    int buflen = buf.limit();

    parser.execute(Util.SETTINGS_NULL, buf);

    check(buflen == buf.position());

    buf  = buffer("a");
    buflen  = buf.limit();
    
    for (int i = 0; i!= len; ++i) {
      parser.execute(Util.SETTINGS_NULL, buf);
      check(buflen == buf.position());
      buf.rewind();
    }
    
    buf = getBytes(type, len);
    buflen = buf.limit();

    parser.execute(Util.SETTINGS_NULL, buf);

    check(buflen == buf.position());

  }

  static ByteBuffer getBytes (ParserType type, int length) {
    if (ParserType.HTTP_BOTH == type) {
      throw new RuntimeException("only HTTP_REQUEST and HTTP_RESPONSE");
    }
    
    String template = "%s\r\nConnection: Keep-Alive\r\nContent-Length: %d\r\n\r\n";
    String str = null;
    if (ParserType.HTTP_REQUEST == type) {
      str = String.format(template, "GET / HTTP/1.1", length); 
    } else {
      str = String.format(template, "HTTP/1.0 200 OK", length);
    }
    return buffer(str);
  }

  public static void test () {
    p(TestNoOverflowLongBody.class);
    test(ParserType.HTTP_REQUEST, 1000);
    test(ParserType.HTTP_REQUEST, 100000);
    test(ParserType.HTTP_RESPONSE, 1000);
    test(ParserType.HTTP_RESPONSE, 100000);
  }



}
