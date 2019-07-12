package com.hcl.mortgageApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PropertyRate {
	
	@Id
	private long pincode;
	
	@Column(name="sqftPrice")
	private long sqftPrice;

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public long getSqftPrice() {
		return sqftPrice;
	}

	public void setSqftPrice(long sqftPrice) {
		this.sqftPrice = sqftPrice;
	}

	@Override
	public String toString() {
		return "PropertyRate [pincode=" + pincode + ", sqftPrice=" + sqftPrice + "]";
	}

	
	
	
	
	

}
