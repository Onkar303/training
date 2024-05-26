package com.assignement.carhireservice.mapper;

import com.assignement.carhireservice.dto.CustomerDto;
import com.assignement.carhireservice.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {AddressMapper.class,PhoneMapper.class})
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
