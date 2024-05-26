package com.assignement.carhireservice.repository;

import com.assignement.carhireservice.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;


public interface CustomerRepository extends CrudRepository<Customer, UUID> {

    Customer save(Customer customer);

    List<Customer> findAll();

    Customer findCustomerById(UUID id);

}
