package com.hcl.mortgageApp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

public class User {
	
	private String name;
	
	private String gender;
	
	private String dob;
	
	private double monthlySalary;
	
	private String PAN;
	
	private String propertyType;
	
	private String address;
	
	private long pincode;
	
	private long sqftArea;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String pAN) {
		PAN = pAN;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public long getSqftArea() {
		return sqftArea;
	}

	public void setSqftArea(long sqftArea) {
		this.sqftArea = sqftArea;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", gender=" + gender + ", dob=" + dob + ", monthlySalary=" + monthlySalary
				+ ", PAN=" + PAN + ", propertyType=" + propertyType + ", address=" + address + ", pincode=" + pincode
				+ ", sqftArea=" + sqftArea + "]";
	}
	
	

}

