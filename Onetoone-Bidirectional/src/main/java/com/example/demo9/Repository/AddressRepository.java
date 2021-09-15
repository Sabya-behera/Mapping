package com.example.demo9.Repository;

import com.example.demo9.Model.Address1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address1,Long>
{
}
