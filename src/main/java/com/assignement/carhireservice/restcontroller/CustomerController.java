package com.assignement.carhireservice.restcontroller;

import com.assignement.carhireservice.dto.AddressDto;
import com.assignement.carhireservice.dto.CustomerDto;
import com.assignement.carhireservice.mapper.AddressMapper;
import com.assignement.carhireservice.model.Address;
import com.assignement.carhireservice.model.Customer;
import com.assignement.carhireservice.repository.CustomerRepository;
import com.assignement.carhireservice.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(path = "/new")
    public Customer addNewCustomer(@RequestBody CustomerDto customerDto) throws Exception{
        return this.customerService.addNewCustomer(customerDto);
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers(){
        return this.customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer findCustomerById(@PathVariable("id") UUID id){
        return this.customerService.findCustomerById(id);
    }


    @GetMapping("/address/{id}")
    public List<Address> findAllAddressesByCustomerId(@PathVariable("id") UUID id){
        return this.customerService.findAllAddressesByCustomerId(id);
    }

}
