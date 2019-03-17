/**
 * 
 */
package com.basic.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.ApplicationArguments;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Naidu
 *
 */
@RestController
@RequestMapping(value = "/v1")
public class SimpleController {

	JSONObject obj = new JSONObject();

	@RequestMapping(value = "/healthCheck", method = RequestMethod.GET, produces = "applicaiton/json")
	public ResponseEntity<String> healthCheck() {
		System.out.println("Health Check execution");
		return new ResponseEntity<>("Application Running", HttpStatus.OK);
	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST, produces = "applicaiton/json")
	public ResponseEntity<String> addCustomer(@RequestParam(name = "name") String name,
			@RequestParam(name = "age") String age) throws JSONException {
		System.out.println("Customer addition using @RequestParam ");
		obj.put("name", name);
		obj.put("age", age);
		System.out.println("Customer addition :" + obj.toString());
		return new ResponseEntity<>(obj.toString(), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/customer", method = RequestMethod.GET, produces = "applicaiton/json")
	public ResponseEntity<String> getCustomer() throws JSONException {
		System.out.println("Retrieve Customer Details => " + obj.toString());
		return new ResponseEntity<>(obj.toString(), HttpStatus.ACCEPTED);
	}

}
