package com.bhatiya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhatiya.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
