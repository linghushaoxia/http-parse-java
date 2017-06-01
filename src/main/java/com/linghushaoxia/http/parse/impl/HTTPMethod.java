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
  /**
   * 
   * @功能说明:初始化http方法
   * @param methodName
   * 方法名
   * @return HTTPMethod
   * @time:2017年6月1日下午9:34:48
   * @author:linghushaoxia
   * @exception:
   *
   */
  public static HTTPMethod parse(String methodName) {
	if ("HTTP_DELETE".equalsIgnoreCase(methodName)) {
	    return HTTP_DELETE;
	}  
	if ("DELETE".equalsIgnoreCase(methodName)) {
	    return HTTP_DELETE;
	}  
	if ("HTTP_GET".equalsIgnoreCase(methodName)) {
	    return HTTP_GET;
	}  
	if ("GET".equalsIgnoreCase(methodName)) {
	    return HTTP_GET;
	}  
	if ("HTTP_HEAD".equalsIgnoreCase(methodName)) {
	    return HTTP_HEAD;
	}  
	if ("HEAD".equalsIgnoreCase(methodName)) {
	    return HTTP_HEAD;
	}  
	if ("HTTP_POST".equalsIgnoreCase(methodName)) {
	    return HTTP_POST;
	}  
	if ("POST".equalsIgnoreCase(methodName)) {
	    return HTTP_POST;
	}  
	if ("HTTP_PUT".equalsIgnoreCase(methodName)) {
	    return HTTP_PUT;
	}  
	if ("PUT".equalsIgnoreCase(methodName)) {
	    return HTTP_PUT;
	}  
	if ("HTTP_PATCH".equalsIgnoreCase(methodName)) {
	    return HTTP_PATCH;
	}  
	if ("PATCH".equalsIgnoreCase(methodName)) {
	    return HTTP_PATCH;
	}  
	if ("HTTP_CONNECT".equalsIgnoreCase(methodName)) {
	    return HTTP_CONNECT;
	}  
	if ("CONNECT".equalsIgnoreCase(methodName)) {
	    return HTTP_CONNECT;
	}  
	if ("HTTP_OPTIONS".equalsIgnoreCase(methodName)) {
	    return HTTP_OPTIONS;
	}  
	if ("OPTIONS".equalsIgnoreCase(methodName)) {
	    return HTTP_OPTIONS;
	}  
	if ("HTTP_TRACE".equalsIgnoreCase(methodName)) {
	    return HTTP_TRACE;
	}  
	if ("TRACE".equalsIgnoreCase(methodName)) {
	    return HTTP_TRACE;
	}  
	if ("HTTP_COPY".equalsIgnoreCase(methodName)) {
	    return HTTP_COPY;
	}  
	if ("COPY".equalsIgnoreCase(methodName)) {
	    return HTTP_COPY;
	}  
	if ("HTTP_LOCK".equalsIgnoreCase(methodName)) {
	    return HTTP_LOCK;
	}  
	if ("LOCK".equalsIgnoreCase(methodName)) {
	    return HTTP_LOCK;
	}  
	if ("HTTP_MKCOL".equalsIgnoreCase(methodName)) {
	    return HTTP_MKCOL;
	}  
	if ("MKCOL".equalsIgnoreCase(methodName)) {
	    return HTTP_MKCOL;
	}  
	if ("HTTP_MOVE".equalsIgnoreCase(methodName)) {
	    return HTTP_MOVE;
	}  
	if ("MOVE".equalsIgnoreCase(methodName)) {
	    return HTTP_MOVE;
	}  
	if ("HTTP_PROPFIND".equalsIgnoreCase(methodName)) {
	    return HTTP_PROPFIND;
	}  
	if ("PROPFIND".equalsIgnoreCase(methodName)) {
	    return HTTP_PROPFIND;
	}  
	if ("HTTP_PROPPATCH".equalsIgnoreCase(methodName)) {
	    return HTTP_PROPPATCH;
	}  
	if ("PROPPATCH".equalsIgnoreCase(methodName)) {
	    return HTTP_PROPPATCH;
	}  
	if ("HTTP_UNLOCK".equalsIgnoreCase(methodName)) {
	    return HTTP_UNLOCK;
	}  
	if ("UNLOCK".equalsIgnoreCase(methodName)) {
	    return HTTP_UNLOCK;
	}  
	if ("HTTP_REPORT".equalsIgnoreCase(methodName)) {
	    return HTTP_REPORT;
	}  
	if ("REPORT".equalsIgnoreCase(methodName)) {
	    return HTTP_REPORT;
	}  
	if ("HTTP_MKACTIVITY".equalsIgnoreCase(methodName)) {
	    return HTTP_MKACTIVITY;
	}  
	if ("MKACTIVITY".equalsIgnoreCase(methodName)) {
	    return HTTP_MKACTIVITY;
	}  
	if ("HTTP_CHECKOUT".equalsIgnoreCase(methodName)) {
	    return HTTP_CHECKOUT;
	}  
	if ("CHECKOUT".equalsIgnoreCase(methodName)) {
	    return HTTP_CHECKOUT;
	}  
	if ("HTTP_MERGE".equalsIgnoreCase(methodName)) {
	    return HTTP_MERGE;
	}  
	if ("MERGE".equalsIgnoreCase(methodName)) {
	    return HTTP_MERGE;
	}  
	if ("HTTP_MSEARCH".equalsIgnoreCase(methodName)) {
	    return HTTP_MSEARCH;
	}  
	if ("M-SEARCH".equalsIgnoreCase(methodName)) {
	    return HTTP_MSEARCH;
	} 
	if ("HTTP_NOTIFY".equalsIgnoreCase(methodName)) {
	    return HTTP_NOTIFY;
	}
	if ("NOTIFY".equalsIgnoreCase(methodName)) {
	    return HTTP_NOTIFY;
	}
	if ("HTTP_SUBSCRIBE".equalsIgnoreCase(methodName)) {
	    return HTTP_SUBSCRIBE;
	}
	if ("SUBSCRIBE".equalsIgnoreCase(methodName)) {
	    return HTTP_SUBSCRIBE;
	}
	if ("HTTP_UNSUBSCRIBE".equalsIgnoreCase(methodName)) {
	    return HTTP_UNSUBSCRIBE;
	}
	if ("UNSUBSCRIBE".equalsIgnoreCase(methodName)) {
	    return HTTP_UNSUBSCRIBE;
	}
	if ("PATCH".equalsIgnoreCase(methodName)) {
	    return HTTP_PATCH;
	} 
	if ("PURGE".equalsIgnoreCase(methodName)) {
	    return HTTP_PURGE;
	} 	    
	return null;
    }
  void init (String name) {
    ASCII = null == ASCII ? Charset.forName("US-ASCII") : ASCII;
    this.bytes = name.getBytes(ASCII);
  }
}
