package com.linghushaoxia.http.parse.impl;


import java.nio.ByteBuffer;

public abstract class HTTPErrorCallback implements com.linghushaoxia.http.parse.IHTTPErrorCallback{
	public void cb (com.linghushaoxia.http.parse.HTTPParser parser, String mes, ByteBuffer buf, int initial_position) {
	  this.cb((HTTPParserDefault)parser, Util.error(mes, buf, initial_position));
	}

  public abstract void cb(HTTPParserDefault parser, String error); 
}
