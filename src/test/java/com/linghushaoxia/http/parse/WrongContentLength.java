package com.linghushaoxia.http.parse;

import java.nio.ByteBuffer;

import com.linghushaoxia.http.parse.impl.ParserType;
import static com.linghushaoxia.http.parse.Util.*;
public class WrongContentLength {
  static final String contentLength = "GET / HTTP/1.0\r\n" +
                                      "Content-Length: 5\r\n" +
                                      "\r\n" +
                                      "hello" +
                                      "hello_again";
  static void test () {
    p(WrongContentLength.class);
    HTTPParser parser = new HTTPParser(ParserType.HTTP_REQUEST);
    ByteBuffer buf    = buffer(contentLength);
    
    Settings settings = new Settings();

    int read = parser.execute(settings, buf);
    check (settings.msg_cmplt_called);
    check ("invalid method".equals(settings.err));
  
  }
  public static void main(String [] args) {
    test();
  }

  static class Settings extends ParserSettings {
    public int bodyCount;
    public boolean msg_cmplt_called;
    public String err;
    Settings () {
      this.on_message_complete = new IHTTPCallback () {
        public int cb (HTTPParser p) {
          check (5 == bodyCount);
          msg_cmplt_called = true;
          return 0;
        }
      };
      this.on_body = new IHTTPDataCallback() {
        public int cb (HTTPParser p, ByteBuffer b, int pos, int len) {
          bodyCount += len;
          check ("hello".equals(str(b, pos, len)));
          return 0;
        }
      }; 
      this.on_error = new IHTTPErrorCallback() {
        public void cb (HTTPParser p, String mes, ByteBuffer b, int i) {
          err = mes;
        }
      };
    }
  }

}
