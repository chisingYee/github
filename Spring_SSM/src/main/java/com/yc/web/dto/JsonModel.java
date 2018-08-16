package com.yc.web.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class JsonModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9106902882602433353L;
	
	private Integer code; 
	private Object obj;
	private String errorMsg;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	@Override
	public String toString() {
		return "JsonModel [code=" + code + ", obj=" + obj + ", errorMsg=" + errorMsg + "]";
	}
	
}
