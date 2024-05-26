package com.assignement.carhireservice.restcontroller;

import com.assignement.carhireservice.model.Address;
import com.assignement.carhireservice.service.AddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/address")
public class AddressController {

    AddressService addressService;


    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    public Address findAddressById(UUID addressId){
        return addressService.findAddressById(addressId);
    }


//    public List<Address> findAllAddressesByCustomerId(UUID customerId) {
//        return addressService.findAllAddressesByCustomerId(customerId);
//    }




}
