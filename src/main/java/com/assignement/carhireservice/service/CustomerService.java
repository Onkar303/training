package com.assignement.carhireservice.service;

import com.assignement.carhireservice.dto.CustomerDto;
import com.assignement.carhireservice.model.Customer;
import com.assignement.carhireservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public void addNewCustomer(CustomerDto customerDto){
        Customer customer = new Customer();
        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        customer.setDob(customerDto.getDob());
        customerRepository.save(customer);
    }


    public List<Customer> getAllCustomers(){
        return this.customerRepository.findAll();
    }

}
