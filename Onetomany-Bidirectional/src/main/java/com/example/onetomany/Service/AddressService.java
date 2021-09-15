package com.example.onetomany.Service;


import com.example.onetomany.Model.Address;
import com.example.onetomany.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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
