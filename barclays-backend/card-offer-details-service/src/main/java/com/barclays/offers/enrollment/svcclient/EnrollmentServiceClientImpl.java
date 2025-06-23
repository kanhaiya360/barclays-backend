package com.barclays.offers.enrollment.svcclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.barclays.offers.model.EnrollmentRequest;
import com.barclays.offers.model.EnrollmentResponse;

@Service
public class EnrollmentServiceClientImpl implements IEnrollmentServiceClient{

	@Value("${enrollment_svc_url}")
	private String enrollmentSvcUrl;
	@Override
	public EnrollmentResponse enrollment(EnrollmentRequest enrollmentRequest) {
		
		EnrollmentResponse enrollmentResponse=new EnrollmentResponse();
		RestTemplate restTemplate=new RestTemplate();
		MultiValueMap<String, Object> header=new LinkedMultiValueMap<>();
		HttpEntity<EnrollmentRequest> requestEntity=new HttpEntity(header);
		ResponseEntity<EnrollmentResponse> responseEntity = restTemplate.exchange(enrollmentSvcUrl, HttpMethod.POST,requestEntity,EnrollmentResponse.class);
		if("200".equals(responseEntity.getStatusCode().value())) {
			enrollmentResponse.setRespCode(responseEntity.getStatusCode().toString());
		}
		else {
			
		}
		return null;
	}

}
