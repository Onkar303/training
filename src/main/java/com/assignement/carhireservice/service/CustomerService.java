package com.assignement.carhireservice.service;

import com.assignement.carhireservice.dto.CustomerDto;
import com.assignement.carhireservice.mapper.AddressMapper;
import com.assignement.carhireservice.mapper.CustomerMapper;
import com.assignement.carhireservice.model.Address;
import com.assignement.carhireservice.model.Customer;
import com.assignement.carhireservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {

    CustomerRepository customerRepository;
    CustomerMapper customerMapper;
    AddressMapper addressMapper;


    public CustomerService(CustomerRepository customerRepository,AddressMapper addressMapper,CustomerMapper customerMapper) {
        this.addressMapper = addressMapper;
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }


    public Customer addNewCustomer(CustomerDto customerDto) throws Exception {
        return  customerRepository.save(customerMapper.customerDtoToCustomer(customerDto));
    }

    public List<Customer> getAllCustomers(){
        return this.customerRepository.findAll();
    }

    public Customer findCustomerById(UUID id){
        return this.customerRepository.findCustomerById(id);
    }

    public List<Address> findAllAddressesByCustomerId(UUID customerId){
        return this.customerRepository.findCustomerById(customerId).getAddress();
    }
}
