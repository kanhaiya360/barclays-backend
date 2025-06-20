package com.barclays.offers.exception;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SystemException extends Exception{
	private String respCode;
	private String respMsg;
	public SystemException(String respCode, String respMsg) {
		super();
		this.respCode = respCode;
		this.respMsg = respMsg;
	}

}
