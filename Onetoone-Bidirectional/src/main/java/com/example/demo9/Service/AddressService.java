package com.example.demo9.Service;


import com.example.demo9.Model.Address1;
import com.example.demo9.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService
{
    @Autowired
    AddressRepository addressRepository;

    public List<Address1> getAllAddress()
    {
        return addressRepository.findAll();
    }
    public Address1 addAddress(Address1 address1)
    {
        return addressRepository.save(address1);
    }
}
