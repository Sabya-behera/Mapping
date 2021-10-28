package com.example.demo7.Service;


import com.example.demo7.Model.Address;
import com.example.demo7.Repository.AddressRepository;
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

    public Address getAddressById(long id) {
       return addressRepository.getById(id);
    }

    public String deleteAddress(long id) {
        addressRepository.deleteById(id);
        return "DELETED";
    }

    public Address updateAddress(long id, Address address) {
        Address address1 = addressRepository.getById(id);
         address1.setCity(address.getCity());
         address1.setCountry(address.getCountry());
         address1.setStreet(address.getStreet());
         addressRepository.save(address1);
         return address1;
    }
}
