package com.bhatiya.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bhatiya.entity.Student;
import java.util.List;


//public interface StudentRepo extends CrudRepository<Student, Integer>{

public interface StudentRepo extends JpaRepository<Student, Integer> 
{	

	Student findByName(String name);
	
	Student findByAddress(String address);
	
	Student findByNameAndAddress(String name,String addess);
	
	List<Student>  findByNameOrAddress(String name, String address);
	
	/*
	 * @Query("select u from Student u where u.name=?1 and u,address=?2") Student
	 * getStudentByNameAddress(String name,String address);
	 * 
	 * @Query("select u from Student u where u.name like :nm") List<Student>
	 * searchname(@Param(value="nm") String nm);
	 * 
	 * @Query("select u from Student u where u.name=:nm or u.address=:ad")
	 * List<Student> getByNameOrAddress(@Param("nm") String nm, @Param("ad") String
	 * ad);
	 */
	
	List<Student> findByAddressIsNull();
	
	List<Student> findByAddressIsNotNull();
	
	//List<Student> findByIdNameLike(String name);
	
	//List<Student> findByNameStringWith(String ch);
	
	List<Student> findByNameContaining(String ch);
	
	List<Student> findByOrderByNameDesc();
	
	
}
