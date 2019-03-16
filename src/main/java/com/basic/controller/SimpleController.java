/**
 * 
 */
package com.basic.controller;

import org.springframework.boot.ApplicationArguments;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Naidu
 *
 */
@RestController
@RequestMapping(value = "/v1")
public class SimpleController {

	@RequestMapping(value = "/healthCheck", method = RequestMethod.GET,produces="applicaiton/json")
	public ResponseEntity<String> healthCheck() {
		return new ResponseEntity<>("Application Running", HttpStatus.OK);
	}

}
