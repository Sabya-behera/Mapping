package com.example.demo9.Controller;


import com.example.demo9.Model.Address1;
import com.example.demo9.Service.AddressService;
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
        public List<Address1> getAllAddress()
        {
            return (List<Address1>) addressService.getAllAddress();
        }
        @PostMapping("/post2")
        public Address1 addAddress(@RequestBody Address1 address1)
        {
            addressService.addAddress(address1);
            return address1;
        }


    }
