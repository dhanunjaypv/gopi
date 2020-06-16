/**
 * 
 */
package com.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dhanunjaya.potteti
 *
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@GetMapping("/whish")
	public String whishes()
	{
		return "good morning gopi K";
		
	}

}
