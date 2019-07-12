package com.hcl.mortgageApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.mortgageApp.Entity.LoanDetails;

@Repository
public interface LoanDetailsRepository extends JpaRepository<LoanDetails,Long> {
	

	
	@Query("from LoanDetails o where o.loanAmount <= :loanAmount")
	public List<LoanDetails> findByLoanAmount(@Param("loanAmount") long loanAmount);

}
