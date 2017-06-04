package com.linghushaoxia.http.parse.impl;
/**功能说明：
 * @author:linghushaoxia
 * @time:2017年6月4日上午11:37:31
 * @version:1.0
 * 为中国羸弱的技术撑起一片自立自强的天空
 */
public class HTTPMethodSelector {
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
		    return HTTPMethod.HTTP_DELETE;
		}  
		if ("DELETE".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_DELETE;
		}  
		if ("HTTP_GET".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_GET;
		}  
		if ("GET".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_GET;
		}  
		if ("HTTP_HEAD".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_HEAD;
		}  
		if ("HEAD".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_HEAD;
		}  
		if ("HTTP_POST".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_POST;
		}  
		if ("POST".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_POST;
		}  
		if ("HTTP_PUT".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_PUT;
		}  
		if ("PUT".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_PUT;
		}  
		if ("HTTP_PATCH".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_PATCH;
		}  
		if ("PATCH".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_PATCH;
		}  
		if ("HTTP_CONNECT".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_CONNECT;
		}  
		if ("CONNECT".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_CONNECT;
		}  
		if ("HTTP_OPTIONS".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_OPTIONS;
		}  
		if ("OPTIONS".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_OPTIONS;
		}  
		if ("HTTP_TRACE".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_TRACE;
		}  
		if ("TRACE".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_TRACE;
		}  
		if ("HTTP_COPY".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_COPY;
		}  
		if ("COPY".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_COPY;
		}  
		if ("HTTP_LOCK".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_LOCK;
		}  
		if ("LOCK".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_LOCK;
		}  
		if ("HTTP_MKCOL".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_MKCOL;
		}  
		if ("MKCOL".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_MKCOL;
		}  
		if ("HTTP_MOVE".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_MOVE;
		}  
		if ("MOVE".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_MOVE;
		}  
		if ("HTTP_PROPFIND".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_PROPFIND;
		}  
		if ("PROPFIND".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_PROPFIND;
		}  
		if ("HTTP_PROPPATCH".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_PROPPATCH;
		}  
		if ("PROPPATCH".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_PROPPATCH;
		}  
		if ("HTTP_UNLOCK".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_UNLOCK;
		}  
		if ("UNLOCK".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_UNLOCK;
		}  
		if ("HTTP_REPORT".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_REPORT;
		}  
		if ("REPORT".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_REPORT;
		}  
		if ("HTTP_MKACTIVITY".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_MKACTIVITY;
		}  
		if ("MKACTIVITY".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_MKACTIVITY;
		}  
		if ("HTTP_CHECKOUT".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_CHECKOUT;
		}  
		if ("CHECKOUT".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_CHECKOUT;
		}  
		if ("HTTP_MERGE".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_MERGE;
		}  
		if ("MERGE".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_MERGE;
		}  
		if ("HTTP_MSEARCH".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_MSEARCH;
		}  
		if ("M-SEARCH".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_MSEARCH;
		} 
		if ("HTTP_NOTIFY".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_NOTIFY;
		}
		if ("NOTIFY".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_NOTIFY;
		}
		if ("HTTP_SUBSCRIBE".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_SUBSCRIBE;
		}
		if ("SUBSCRIBE".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_SUBSCRIBE;
		}
		if ("HTTP_UNSUBSCRIBE".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_UNSUBSCRIBE;
		}
		if ("UNSUBSCRIBE".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_UNSUBSCRIBE;
		}
		if ("PATCH".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_PATCH;
		} 
		if ("PURGE".equalsIgnoreCase(methodName)) {
		    return HTTPMethod.HTTP_PURGE;
		} 	    
		return null;
	    }
}

/**
* 现实就是实现理想的过程
*/