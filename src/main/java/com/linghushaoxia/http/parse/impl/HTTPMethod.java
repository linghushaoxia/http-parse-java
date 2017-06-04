package com.linghushaoxia.http.parse.impl;

import java.nio.charset.Charset;

public enum HTTPMethod {
    HTTP_DELETE("DELETE")//    = 0
  , HTTP_GET("GET")
  , HTTP_HEAD("HEAD")
  , HTTP_POST("POST")
  , HTTP_PUT("PUT")
  , HTTP_PATCH("PATCH")
  /* pathological */
  , HTTP_CONNECT("CONNECT")
  , HTTP_OPTIONS("OPTIONS")
  , HTTP_TRACE("TRACE")
  /* webdav */
  , HTTP_COPY("COPY")
  , HTTP_LOCK("LOCK")
  , HTTP_MKCOL("MKCOL")
  , HTTP_MOVE("MOVE")
  , HTTP_PROPFIND("PROPFIND")
  , HTTP_PROPPATCH("PROPPATCH")
  , HTTP_UNLOCK("UNLOCK")
  , HTTP_REPORT("REPORT")
  , HTTP_MKACTIVITY("MKACTIVITY")
  , HTTP_CHECKOUT("CHECKOUT")
  , HTTP_MERGE("MERGE")
  , HTTP_MSEARCH("M-SEARCH")
  , HTTP_NOTIFY("NOTIFY")
  , HTTP_SUBSCRIBE("SUBSCRIBE")
  , HTTP_UNSUBSCRIBE("UNSUBSCRIBE")
  , HTTP_PURGE("PURGE")
  ;

  private static Charset ASCII;
  static {
    ASCII = Charset.forName("US-ASCII");;
  }
  public byte[] bytes;

  HTTPMethod(String name) {
    // good grief, Charlie Brown, the following is necessary because
    // java is retarded:
    // illegal reference to static field from initializer
    //            this.bytes = name.getBytes(ASCII);
    // yet it's not illegal to reference static fields from
    // methods called from initializer.
    init(name);
  }

  void init (String name) {
    ASCII = null == ASCII ? Charset.forName("US-ASCII") : ASCII;
    this.bytes = name.getBytes(ASCII);
  }
}
