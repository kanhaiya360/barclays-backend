package com.barclays.offers.model;

import lombok.Data;

@Data
public class EnrollmentResponse {

	private String respCode;
	private String respMsg;
	private boolean isEnrolled;
	private String status;
	private String typeOfCard;
}
