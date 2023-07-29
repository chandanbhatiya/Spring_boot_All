package com.bhatiya;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bhatiya.configure.MyMassage;

@SpringBootApplication
public class FristProjectSbBybecoderApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(FristProjectSbBybecoderApplication.class, args);
MyMassage msg=	context.getBean(MyMassage.class);
	System.out.println(msg.getMassageString());
	}

}
