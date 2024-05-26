package com.assignement.carhireservice.service;

import com.assignement.carhireservice.model.Address;
import com.assignement.carhireservice.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AddressService {

    AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


   public Address findAddressById(UUID addressId){
        return addressRepository.findAddressById(addressId);
    }


//    public List<Address> findAllAddressesByCustomerId(UUID customerId) {
//        return addressRepository.findAllAddressesByCustomerId(customerId);
//    }


}
