package com.bhatiya;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bhatiya.entity.Address;
import com.bhatiya.entity.Category;
import com.bhatiya.entity.Emp;
import com.bhatiya.entity.Mobile;
import com.bhatiya.entity.Product;
import com.bhatiya.repository.AddressRepo;
import com.bhatiya.repository.CotegoryRepo;
import com.bhatiya.repository.EmpRepo;
import com.bhatiya.repository.MobileRepo;
import com.bhatiya.repository.ProductRepo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToMany;

@SpringBootApplication
public class Application  implements CommandLineRunner{

	@Autowired
	private EmpRepo empRepo;
	
	
	@Autowired
	private MobileRepo mobileRepo;
	
	@Autowired
	private AddressRepo addressRepo;
	
	@Autowired
	private CotegoryRepo categoryRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	public static void main(String[] args) {
	
		
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Emp emp=new Emp(); emp.setEmpName("chandan bhatiya");
		 * 
		 * Mobile mb=new Mobile(); mb.setMobileName("Iphone13");
		 * 
		 * 
		 * // emp.setMobile(mb); mb.setEmp(emp);
		 * 
		 * empRepo.save(emp); mobileRepo.save(mb);
		 * 
		 * System.out.println("save successfully");
		 */
		 
		/*
		 * Mobile mb=mobileRepo.findById(1).get();
		 * System.out.println(" Emp Name="+mb.getEmp().getEmpName());
		 * System.out.println(" mobile="+mb.getMobileName());
		 */
		
		//OneToMany ManyToOne
		
		/*
		 * Emp emp=new Emp(); emp.setEmpName("bhatiya");
		 *  
		 * Address ad=new Address(); ad.setAddress("Bihar");
		 * ad.setType("permanent Address"); ad.setEmp(emp);
		 * 
		 * Address ad2=new Address(); ad2.setAddress("Gaya");
		 * ad2.setType("Current address"); ad2.getEmp();
		 * 
		 * List<Address> addlist= Arrays.asList(ad,ad2); emp.setAddress(addlist);
		 * 
		 * empRepo.save(emp); System.out.println("save sucess");
		 */
		
		/*
		 * Emp emp= empRepo.findById(3).get();
		 * System.out.println("Emp name="+emp.getEmpName());
		 * emp.getAddress().forEach(e->
		 * System.out.println(e.getAddress()+"="+e.getType()));
		 */
		
		/*
		 * Address ad=addressRepo.findById(3).get();
		 * System.out.println("Address="+ad.getAddress());
		 * System.out.println("Emp Name ="+ad.getEmp().getEmpName());
		 */
		
		//ManyToMany relationsip
		
		/*
		 * Category cal=new Category(); cal.setCategoryName("Electronics");
		 * 
		 * Category cal2=new Category(); cal2.setCategoryName("Mobile");
		 * 
		 * 
		 * Product pr=new Product(); pr.setProductName("TV");
		 * 
		 * Product pr1=new Product(); pr1.setProductName("IPhone");
		 * 
		 * Product pr2=new Product(); pr2.setProductName("One Plus phone");
		 * 
		 * cal.getProducts().add(pr); cal.getProducts().add(pr2);
		 * cal.getProducts().add(pr1);
		 * 
		 * 
		 * cal2.getProducts().add(pr1); cal2.getProducts().add(pr2);
		 * 
		 * pr.getCategories().add(cal); pr1.getCategories().add(cal);
		 * pr2.getCategories().add(cal);
		 * 
		 * pr1.getCategories().add(cal2); pr2.getCategories().add(cal2);
		 * 
		 * 
		 * categoryRepo.save(cal); categoryRepo.save(cal2);
		 * 
		 * System.out.println("save success");
		 */
		
		/*
		 * Category ca=categoryRepo.findById(2).get();
		 * System.out.println("cotegories name"+ca.getCategoryName());
		 * ca.getProducts().forEach(e-> System.out.println(e.getProductName()));
		 */
		
	Product p=productRepo.findById(2).get();
	System.out.println("Product Name="+p.getProductName());
	p.getCategories().forEach(e-> System.out.println(e.getCategoryName()));
		
	}

	
}
