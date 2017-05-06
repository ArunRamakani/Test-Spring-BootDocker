package arun.ramakani.simple.docker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	
	
	@Value("${currentprofile}")
	  private String currentprofile;
	
	@GetMapping(path = "/testdocker", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getVehicleDetailsText() {
		return "Test Docker successfull with spring profile " + currentprofile;
	}

}
