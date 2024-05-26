package com.assignement.carhireservice.restcontroller;

import com.assignement.carhireservice.dto.CustomerDto;
import com.assignement.carhireservice.model.Customer;
import com.assignement.carhireservice.repository.CustomerRepository;
import com.assignement.carhireservice.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(path = "/new")
    public void addNewCustomer(@RequestBody CustomerDto customerDto){
        this.customerService.addNewCustomer(customerDto);
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers(){
        return this.customerService.getAllCustomers();
    }


}
