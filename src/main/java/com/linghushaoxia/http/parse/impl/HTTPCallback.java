package com.linghushaoxia.http.parse.impl;

public abstract class HTTPCallback implements com.linghushaoxia.http.parse.IHTTPCallback{
	public int cb (com.linghushaoxia.http.parse.HTTPParser parser) {
	  return this.cb((HTTPParserDefault)parser);
	}
	public abstract int cb (HTTPParserDefault parser);
}
