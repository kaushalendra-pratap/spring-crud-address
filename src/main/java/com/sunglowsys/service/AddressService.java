package com.sunglowsys.service;

import com.sunglowsys.domain.Address;

import javax.persistence.Id;
import java.util.List;

public interface AddressService {

    Address save(Address address);

    Address update(Address address,long id);

    List<Address> findAll();

    Address findById(Long id);

    void delete(Long id);
}
