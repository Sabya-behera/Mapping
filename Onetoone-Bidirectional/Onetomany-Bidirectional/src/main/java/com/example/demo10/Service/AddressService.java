package com.example.demo10.Service;

import com.example.demo10.Model.Address;
import com.example.demo10.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressService
{
    @Autowired
    AddressRepository addressRepository;
    public List<Address> getAllAddress()
    {
        return addressRepository.findAll();
    }
    public Address addAddress(Address address)
    {
        return addressRepository.save(address);
    }

}
