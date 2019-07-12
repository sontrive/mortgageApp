package com.hcl.mortgageApp.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class LoanDetails {
	
	@Id
	private long Id;
	
	@Column(name="loanAmount")
	private long loanAmount;
	
	@Column(name="tenure")
	private long tenure;
	
	@Column(name="rateOfInterest")
	private long rateOfInterest;
	
	@Column(name="monthlyEMI")
	private long monthlyEMI;
	
	@Transient
	private String message;
	
	@Transient
	private List<LoanDetails> eligibleOffers;

	public List<LoanDetails> getEligibleOffers() {
		return eligibleOffers;
	}

	public void setEligibleOffers(List<LoanDetails> offers) {
		this.eligibleOffers = offers;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public long getTenure() {
		return tenure;
	}

	public void setTenure(long tenure) {
		this.tenure = tenure;
	}

	public long getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(long rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public long getMonthlyEMI() {
		return monthlyEMI;
	}

	public void setMonthlyEMI(long monthlyEMI) {
		this.monthlyEMI = monthlyEMI;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "LoanDetails [Id=" + Id + ", loanAmount=" + loanAmount + ", tenure=" + tenure + ", rateOfInterest="
				+ rateOfInterest + ", monthlyEMI=" + monthlyEMI + ", message=" + message + ", eligibleOffers="
				+ eligibleOffers + "]";
	}

	

	
	
	

}
