package com.linghushaoxia.http.server;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;

import com.linghushaoxia.http.parse.HTTPParser;
import com.linghushaoxia.http.parse.ParserSettings;

/**功能说明：
 * @author:linghushaoxia
 * @time:2017年6月4日下午12:06:10
 * @version:1.0
 * 为中国羸弱的技术撑起一片自立自强的天空
 */
public class HttpServerSocket {
	//端口
	private int port;
	private String encode = "UTF-8";
	private ServerSocket serverSocket;
	public HttpServerSocket(int port){
		this.port=port;
	}
	/**
	 * 
	 * 功能说明: 启动服务端
	 * @time:2017年6月4日下午12:20:14
	 * @author:linghushaoxia
	 * @exception:
	 *
	 */
	public void startServer(){
		try {
			//启动服务端,监听端口
			serverSocket = new ServerSocket(this.port);
			System.out.println("服务启动完成。");
			Thread thread = new Thread(){
				public void run(){
					//处理请求
					acceptRequest();
				}
			};
			thread.start();
		} catch (IOException e) {
			System.out.println("初始化服务端出现异常");
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * 功能说明: 接收请求
	 * @time:2017年6月4日下午12:19:52
	 * @author:linghushaoxia
	 * @exception:
	 *
	 */
	private void acceptRequest(){
		if (serverSocket==null) {
			System.out.println("服务还未启动。");
			return;
		}
		while(true){
			try {
				Socket client = serverSocket.accept();
				 /**
				  * 根据http协议解析输入流
				  */
                InputStream inputStream = client.getInputStream();
                byte[] requestBytes= getBytesFromStream(inputStream);
                parseHttp(requestBytes);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 
	 * 功能说明:将输入流转为字节数组
	 * @param inputStream
	 * @return byte[]
	 * @time:2017年6月4日下午4:32:25
	 * @author:linghushaoxia
	 * @exception:
	 *
	 */
	private byte[] getBytesFromStream(InputStream inputStream){
		byte[] resultBytes =null;
		try {
			ByteArrayOutputStream bOutputStream = new ByteArrayOutputStream();
	        byte[] bytes = new byte[1024];
	        int ava =-1;
	        while((ava=inputStream.available())>0){
	        	if (ava<bytes.length) {
		        	bytes = new byte[ava];
					inputStream.read(bytes);
				}else {
		            inputStream.read(bytes);
				}
		        bOutputStream.write(bytes);
	        } 
	        resultBytes = bOutputStream.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultBytes;
	}
	/**
	 * 
	 * 功能说明:解析http请求
	 * @param bytes
	 * 请求的字节数组
	 * @time:2017年6月4日下午7:11:07
	 * @author:linghushaoxia
	 * @exception:
	 *
	 */
	private void parseHttp(byte[] bytes){
		HTTPParser parser = new HTTPParser();
		ByteBuffer data = ByteBuffer.wrap(bytes);
		ParserSettings settings = new ParserSettings();
		parser.execute(settings, data);
	}
}

/**
* 现实就是实现理想的过程
*/