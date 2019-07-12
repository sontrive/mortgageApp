package com.hcl.mortgageApp.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hcl.mortgageApp.Entity.LoanDetails;
import com.hcl.mortgageApp.Entity.Offer;
import com.hcl.mortgageApp.Entity.PropertyRate;
import com.hcl.mortgageApp.Model.User;
import com.hcl.mortgageApp.Repository.LoanDetailsRepository;
import com.hcl.mortgageApp.Repository.PropertyRateRepository;


@Service
public class LoanService {
	
	@Autowired
	PropertyRateRepository propertyRateRepository;
	
	
	  @Autowired 
	  LoanDetailsRepository loanDetailsRepository;
	 
	  
	  public LoanDetails findOfferSuitableForUser(User user) {
		  
		  LocalDate now = LocalDate.now(); // Today's date
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
			// convert String to LocalDate
		  LocalDate l = LocalDate.parse(user.getDob(), formatter); //specify year, month, date directly
		  Period diff = Period.between(l, now);
		  
		  double age= diff.getYears();
		  if (age < 25 || user.getMonthlySalary() < 10000) {
			   
			  LoanDetails loanDetails=new LoanDetails(); 
			  loanDetails.setMessage("You are not eligible for loan amount");
			   return loanDetails;
		  }
		 
		  else {
			  System.out.println("Hello");
			  long propertyValue = user.getSqftArea() * propertyRateRepository.findByPincode(user.getPincode()).getSqftPrice();
			  if (propertyValue<500000 ) {
				  LoanDetails loanDetails=new LoanDetails(); 
				  loanDetails.setMessage("You are not eligible for loan amount as it is less than 500000");
				   return loanDetails;
			  }
			  
			  else {
				  System.out.println("Actual offers");
				  long eligibleLoanAmount = (long) (propertyValue * .80);
				  System.out.println(eligibleLoanAmount);
				  List<LoanDetails> offers=loanDetailsRepository.findByLoanAmount(eligibleLoanAmount);
				 LoanDetails eligibleLoanDetails=new LoanDetails();
				 eligibleLoanDetails.setEligibleOffers(offers);
				  return eligibleLoanDetails;
			  }
	  
		  }
		  
	  }
	  

}
