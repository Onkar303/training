package com.assignement.carhireservice.repository;

import com.assignement.carhireservice.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AddressRepository extends CrudRepository<Address, UUID>, JpaRepository<Address,UUID> {

    Address findAddressById(UUID id);

}
