package com.example.demo7.Controller;


import com.example.demo7.Model.Address;
import com.example.demo7.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController
{
    @Autowired
    AddressService addressService;

    @GetMapping("/get2")
    public List<Address> getAllAddress()
    {
        return addressService.getAllAddress();
    }
    @PostMapping("/post2")
     public Address addAddress(@RequestBody Address address)
    {
        addressService.addAddress(address);
        return address;
    }


}