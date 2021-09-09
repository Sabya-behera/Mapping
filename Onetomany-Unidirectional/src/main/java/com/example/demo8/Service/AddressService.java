package com.example.demo8.Service;


import com.example.demo8.Model.Address;
import com.example.demo8.Repository.AddressRepository;
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
        System.out.println("Service class");
        return addressRepository.save(address);
    }




}
