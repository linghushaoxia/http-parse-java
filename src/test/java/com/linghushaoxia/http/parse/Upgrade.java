package com.linghushaoxia.http.parse;

import java.nio.ByteBuffer;

import com.linghushaoxia.http.parse.impl.ParserType;
import static com.linghushaoxia.http.parse.Util.*;
public class Upgrade {
  static final String upgrade = "GET /demo HTTP/1.1\r\n" +
                                "Connection: Upgrade\r\n" +
                                "Upgrade: WebSocket\r\n\r\n" +
                                "third key data";
  static void test () {
    p(Upgrade.class);
    HTTPParser parser = new HTTPParser(ParserType.HTTP_REQUEST);
    ByteBuffer buf    = buffer(upgrade);
    
    int read = parser.execute(Util.SETTINGS_NULL, buf);
    check (63 == read);
    String s = str(buf);
    check ("third key data".equals(str(buf)));
  
  }

}
