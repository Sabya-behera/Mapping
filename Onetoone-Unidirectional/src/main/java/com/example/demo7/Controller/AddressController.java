package com.example.demo7.Controller;


import com.example.demo7.Model.Address;
import com.example.demo7.Model.Student;
import com.example.demo7.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/get2/{id}")
    public Address getAddressById(@PathVariable long id)
    {
        return addressService.getAddressById(id);
    }

    @DeleteMapping("/delete2/{id}")
    public String deleteAddress(@PathVariable("id") long id)
    {
        return addressService.deleteAddress(id);
    }

    @PutMapping("/put2/{id}")
    public Address updateAddress(@PathVariable("id") long id,@RequestBody Address address)
    {
        addressService.updateAddress(id,address);
        return address;
    }


}