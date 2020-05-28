package com.db.CustomerJPAApplication;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	public List<Customer> getCustomerByName(String name);
	
	

}
