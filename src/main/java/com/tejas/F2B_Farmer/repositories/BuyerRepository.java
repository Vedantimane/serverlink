package com.tejas.F2B_Farmer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tejas.F2B_Farmer.model.Buyer;



@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Long>{
	
	
	
	Buyer findByEmail(String email);
    
}