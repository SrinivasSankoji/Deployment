package com.actuator.greenlearner;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "controllerEndPoint")
public class CustomRestControllerEndPoint {

	@GetMapping("/message-from-solar")
	public ResponseEntity<String> readEndPoint() {
		return new ResponseEntity<>("This is Bhaumik!! Reporting from Hyderabad", HttpStatus.OK);
	}
}
