package com.linghushaoxia.http.parse;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.linghushaoxia.http.server.HttpClientUtil;

/**功能说明：
 * @author:linghushaoxia
 * @time:2017年6月4日下午4:06:14
 * @version:1.0
 * 为中国羸弱的技术撑起一片自立自强的天空
 */
public class HttpClientStart {
	public static void main(String[] args) {
		String url="http://127.0.0.1:8080/http/test";
		Map<String, String> mapParas = new HashMap<String, String>();
		mapParas.put("date", new Date().toString());
		HttpClientUtil.post(url, mapParas);
	}
}

/**
* 现实就是实现理想的过程
*/