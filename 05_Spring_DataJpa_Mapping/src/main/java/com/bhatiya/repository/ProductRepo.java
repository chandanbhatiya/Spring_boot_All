package com.bhatiya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhatiya.entity.Address;
import com.bhatiya.entity.Product;

public interface ProductRepo  extends JpaRepository<Product, Integer> {

}
