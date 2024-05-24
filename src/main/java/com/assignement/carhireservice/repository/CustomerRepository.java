package com.assignement.carhireservice.repository;

import com.assignement.carhireservice.dto.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("select c from Customer c where c.id = 1 ")
    Customer findById(long id);



}