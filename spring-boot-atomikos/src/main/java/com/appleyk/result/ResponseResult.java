package com.appleyk.result;

public class ResponseResult {

public static final String OK = "OK";
	
	private String msg;

	public ResponseResult() {
		super();
	}

	public ResponseResult(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
