package com.lawencon.core.constant;

public enum UrlConst {
    GATEWAY_BASE("http://gateway-service"),
    GATEWAY_USER_GET_BY_ID("/users?id=");
	
	private final String uri;
	
	UrlConst(final String uri) {
		this.uri = uri;
	}
	
	public String getUri() {
		return uri;
	}
}
