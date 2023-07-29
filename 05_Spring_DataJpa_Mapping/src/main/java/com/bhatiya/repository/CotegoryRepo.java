package com.bhatiya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhatiya.entity.Address;
import com.bhatiya.entity.Category;

public interface CotegoryRepo  extends JpaRepository<Category, Integer> {

}
