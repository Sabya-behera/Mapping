package com.example.demo7.Repository;

import com.example.demo7.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long>
{
}
