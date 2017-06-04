package com.linghushaoxia.http.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Set;

/**功能说明：
 * @author:linghushaoxia
 * @time:2017年6月4日下午12:22:34
 * @version:1.0
 * 为中国羸弱的技术撑起一片自立自强的天空
 */
public class HttpClientUtil {
	 /**
	   * 
	   * 功能说明:发送post请求
	   * @param url
	   * 远程地址
	   * @param mapParas
	   * 参数
	   * @return String
	   * @time:2016年12月22日下午10:38:33
	   * @author:linghushaoxia
	   * @exception:
	   *
	   */
	  public static String post(String url,Map<String, String> mapParas){
		  //返回结果
		  String result = null;
		  BufferedReader reader=null;
		  try {
			  /**
			   * 组装请求参数
			   */
			  StringBuilder builder = new StringBuilder(30);
			  Set<String> keSet= mapParas.keySet();
			  builder.append(url).append("?");
			  for(String key:keSet){
				  builder.append(key).append("=").append(mapParas.get(key)).append("&");
			  }
			  //打开连接
			  HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(builder.toString()).openConnection();
			  /**
			   * 设置通用参数
			   */
			  httpURLConnection.setRequestProperty("Charset", "UTF-8");
			  httpURLConnection.setRequestProperty("accept", "*/*");
			  httpURLConnection.setRequestProperty("connection", "Keep-Alive");
			  httpURLConnection.setRequestProperty("user-agent","Mozilla/5.0 (Windows NT 6.1; WOW64; rv:53.0) Gecko/20100101 Firefox/53.0");
			  httpURLConnection.connect();
			  reader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			  String temp=null;
			  StringBuilder resultBuilder = new StringBuilder();
			  while ((temp=reader.readLine())!=null) {
				  resultBuilder.append(temp).append("\n");
			  }
			  result = resultBuilder.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		 System.out.println(result);
		  return result;
	  }

}

/**
* 现实就是实现理想的过程
*/