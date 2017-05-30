package com.linghushaoxia.http.parse.impl;

import java.nio.ByteBuffer;

public class HTTPParserDefault extends com.linghushaoxia.http.parse.HTTPParser {
  
  public HTTPParserDefault() { super(); }
  public HTTPParserDefault(ParserType type) { super(type); }

  public int getMajor() {
    return super.http_major;
  }

  public int getMinor() {
    return super.http_minor;
  }

  public int getStatusCode() {
    return super.status_code;
  }

  public HTTPMethod getHTTPMethod() {
    return super.method;
  }

  public boolean getUpgrade() {
    return super.upgrade;
  }
  
  public boolean shouldKeepAlive() {
    return super.http_should_keep_alive();
  }
  public void execute(ParserSettingsDefault settings, ByteBuffer data) {
   this.execute(settings.getLoLevelSettings(), data);
  }
} 
