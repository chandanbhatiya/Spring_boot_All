package com.bhatiya;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.bhatiya.entity.Student;
import com.bhatiya.reposetory.StudentRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		StudentRepo stRepo = context.getBean(StudentRepo.class);
		
		/*
		Student st= new Student();
		st.setName("bhatiya");
		st.setAddress("Bihar");
		
		//stRepo.save(st); */
		
		/*
		//List<Student> list=(List<Student>) stRepo.findAll();
		//list.forEach(student -> System.out.println(student));*/
		
		
		
		/*
		 * Student st=stRepo.findById(2).get();
		System.out.println(st);
		st.setName("chandan bhatiya");
		st.setAddress("bihar");
		stRepo.save(st);
		System.out.println("update data");*/
		
		//delete 
		/*
		Student st=stRepo.findById(2).get();
		System.out.println(st);
		stRepo.delete(st);
		System.out.println("delete sucessfully");*/
	/*	
	Student st=	stRepo.findByName("chandan bhatiya");
		System.out.println(st);*/
		/*
		//get student address
		Student st=stRepo.findByAddress("India");
		System.out.println(st);*/
	
	//	get student by and using
		/*
		Student st=stRepo.findByNameAndAddress("Bhatiya", "bihar");
		System.out.println(st);*/
		
		/*
		 * List<Student> st=stRepo.findByNameOrAddress("chandan", "bihar"); st.forEach(
		 * e-> System.out.println(e));
		 */
		/*
		List<Student> st=stRepo.findByAddressIsNull();
		st.forEach(	e-> System.out.println(e));*/
		/*
		List<Student> st=stRepo.findByAddressIsNotNull();
		st.forEach(	e-> System.out.println(e));*/
		/*
		List<Student> st=stRepo.findByIdNameLike("chandan");
		System.out.println(st);*/
		
		/*
		 * List<Student> st=stRepo.findByNameStringWith("c"); System.out.println(st);
		 */
		
		/*
		 * List<Student> st=stRepo.findByNameContaining("c"); System.out.println(st);
		 */
		
		/*
		 * List<Student> st=stRepo.findByOrderByNameDesc(); System.out.println(st);
		 */
		
		/*
		 * Student st= stRepo.getStudentByNameAddress("chandan", "bihar");
		 * System.out.println(st);
		 */
		/*
		 * List<Student> st=stRepo.searchname("bhatiya"); st.forEach( e->
		 * System.out.println(e));
		 */
		
		
		
		//pagination
		Sort sort=Sort.by("name").ascending();
		List<Student> listSortStudent=stRepo.findAll(sort);
		System.out.println("______________-sorting student details___________________");
		Pageable pageable=PageRequest.of(2, 2,sort);
	Page<Student> page=stRepo.findAll(pageable);
	page.get().forEach(e->System.out.println(e));
		System.out.println("Size=" +page.getSize());
		System.out.println("Element +"+page.getTotalElements());
		System.out.println("pages=" +page.getTotalPages());
	
		
		
	}
	

}
