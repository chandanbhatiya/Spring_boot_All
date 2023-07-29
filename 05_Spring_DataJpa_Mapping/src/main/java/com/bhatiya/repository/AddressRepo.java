package com.bhatiya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhatiya.entity.Address;

public interface AddressRepo  extends JpaRepository<Address, Integer>{

}
