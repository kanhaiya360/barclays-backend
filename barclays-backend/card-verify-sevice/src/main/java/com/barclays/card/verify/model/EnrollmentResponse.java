package com.barclays.card.verify.model;

import lombok.Data;

@Data
public class EnrollmentResponse {
	private String status;
	private String respCode;
	private String respMsg;
}
