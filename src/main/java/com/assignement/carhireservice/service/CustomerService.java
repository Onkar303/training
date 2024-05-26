package com.assignement.carhireservice.service;

import com.assignement.carhireservice.dto.AddressDto;
import com.assignement.carhireservice.dto.CustomerDto;
import com.assignement.carhireservice.mapper.AddressMapper;
import com.assignement.carhireservice.model.Address;
import com.assignement.carhireservice.model.Customer;
import com.assignement.carhireservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {

    CustomerRepository customerRepository;
    AddressMapper addressMapper;

    public CustomerService(CustomerRepository customerRepository,AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
        this.customerRepository = customerRepository;
    }


    public Customer addNewCustomer(CustomerDto customerDto) throws Exception {
        Customer customer = new Customer();
        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        customer.setDob(customerDto.getDob());

        customer.setAddress(getAllAddress(customerDto.getAddress()));

        return  customerRepository.save(customer);

    }

    public List<Customer> getAllCustomers(){
        return this.customerRepository.findAll();
    }

    public Customer findCustomerById(UUID id){
        return this.customerRepository.findCustomerById(id);
    }

    private List<Address> getAllAddress(List<AddressDto> addressDtoList){

        List<Address> addressList = new ArrayList<>();

        addressDtoList.forEach(addressDto -> {
            addressList.add(addressMapper.addressDtoToAddress(addressDto));
        });

        return addressList;
    }


}
