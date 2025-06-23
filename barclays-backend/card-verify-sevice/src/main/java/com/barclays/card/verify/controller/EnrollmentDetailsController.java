package com.barclays.card.verify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.card.verify.model.EnrollmentRequest;
import com.barclays.card.verify.model.EnrollmentResponse;
import com.barclays.card.verify.service.IEnrollmentService;

@RestController
@RequestMapping("/api/v1")
public class EnrollmentDetailsController {

	@Autowired
	private IEnrollmentService enrollmentService ;
	@PostMapping("/enrollment")
	public EnrollmentResponse enrollment(@RequestBody EnrollmentRequest enrollmentRequest,
			@RequestHeader(name = "clientId", required = false) String clientId,
			@RequestHeader(name = "channelId", required = false) String channelId,
			@RequestHeader(name = "msgTs", required = false) String msgTs,
			@RequestHeader(name = "corelationId", required = false) String corelationId,
			@RequestHeader(name = "authToken", required = false) String authToken) {

		EnrollmentResponse enrollmentResponse = new EnrollmentResponse();
		enrollmentResponse.setRespCode("0");
		enrollmentResponse.setRespMsg("success");
		enrollmentResponse.setStatus("active");

		return enrollmentResponse;
	}
}
