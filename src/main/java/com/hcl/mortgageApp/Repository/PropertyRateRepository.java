package com.hcl.mortgageApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.mortgageApp.Entity.PropertyRate;

@Repository
public interface PropertyRateRepository extends JpaRepository<PropertyRate,Long> {
	
	//@Query("from PropertyRate p where p.pincode = :pincode")
	public PropertyRate findByPincode(long pincode);

}
