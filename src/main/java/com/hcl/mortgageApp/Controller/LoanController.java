package com.hcl.mortgageApp.Controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hcl.mortgageApp.Entity.LoanDetails;
import com.hcl.mortgageApp.Entity.Offer;
import com.hcl.mortgageApp.Entity.PropertyRate;
import com.hcl.mortgageApp.Model.User;
import com.hcl.mortgageApp.Service.LoanService;

@Controller
public class LoanController {
	
	@Autowired
	LoanService loanService;
	
	
	@PostMapping("/offer")
	public ResponseEntity<LoanDetails> findOfferSuitableForUser(@RequestBody User user) {
		System.out.println(user);
		LoanDetails loanDetails=loanService.findOfferSuitableForUser(user);
		if(user==null) {
			 return new ResponseEntity<LoanDetails>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<LoanDetails>(loanDetails, HttpStatus.OK);
		
		
}
	
}
