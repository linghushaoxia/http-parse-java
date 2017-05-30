package com.linghushaoxia.http.parse;

import java.nio.ByteBuffer;

public interface IHTTPErrorCallback {
	public void cb (HTTPParser parser, String mes, ByteBuffer buf, int initial_position);
}
