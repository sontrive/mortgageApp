package com.hcl.mortgageApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Offer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="loanAmount")
	private long loanAmount;
	
	@Column(name="tenure")
	private long tenure;
	
	@Column(name="rateOfInterest")
	private long rateOfInterest;
	
	@Column(name="monthlyEMI")
	private long monthlyEMI;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Offer [id=" + id + ", loanAmount=" + loanAmount + ", tenure=" + tenure + ", rateOfInterest="
				+ rateOfInterest + ", monthlyEMI=" + monthlyEMI + "]";
	}

	
	
	

}
