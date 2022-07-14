package com.sunglowsys.controller;

import com.sunglowsys.domain.Address;
import com.sunglowsys.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressResourse {

    @Autowired
    private AddressService  addressService;

    @PostMapping("/addresses")
    public Address create(@RequestBody Address  address) {
        return addressService.save(address);
    }
    @PutMapping("/addresses")
    public List<Address> saveAll(@RequestBody Address addresses) {
        return (List<Address>) addressService.save(addresses);
    }
    @PutMapping
    public Address update(@RequestBody Address address,@PathVariable("id") Long id){
        return addressService.update(address,id);
    }
    @GetMapping("/addresses")
    public List<Address> getAll() {
        List<Address> addresses=addressService.findAll();
        return addresses;
    }
    @GetMapping("/addresses/{id}")
    public Address getById(@PathVariable("id") Long id){
        return addressService.findById(id);

    }
    @DeleteMapping("/address/{id}")
    public void delete(@PathVariable("id") Long id) {
        addressService.delete(id);
    }
}