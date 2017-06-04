package com.linghushaoxia.http.parse;

import com.linghushaoxia.http.server.HttpServerSocket;

/**功能说明：
 * @author:linghushaoxia
 * @time:2017年6月4日下午4:01:46
 * @version:1.0
 * 为中国羸弱的技术撑起一片自立自强的天空
 */
public class HttpServerStart {
	public static void main(String[] args) {
		int port=8080;
		HttpServerSocket httpServerSocket = new HttpServerSocket(port);
		httpServerSocket.startServer();
	}
}

/**
* 现实就是实现理想的过程
*/