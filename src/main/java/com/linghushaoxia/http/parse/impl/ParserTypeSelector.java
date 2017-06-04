package com.linghushaoxia.http.parse.impl;
/**功能说明：
 * @author:linghushaoxia
 * @time:2017年6月4日上午11:33:14
 * @version:1.0
 * 为中国羸弱的技术撑起一片自立自强的天空
 */
public class ParserTypeSelector {
	public static ParserType parse(String s) {
		if ("HTTP_REQUEST".equalsIgnoreCase(s)) {
			return ParserType.HTTP_REQUEST;
		} else if ("HTTP_RESPONSE".equalsIgnoreCase(s)) {
			return ParserType.HTTP_RESPONSE;
		} else if ("HTTP_BOTH".equalsIgnoreCase(s)) {
			return ParserType.HTTP_BOTH;
		} else {
			return null;
		}
	}
}

/**
* 现实就是实现理想的过程
*/