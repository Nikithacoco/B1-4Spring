package com.tns.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mobile {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("The File is executing...!");
		/*Airtel ai=(Airtel) a.getBean("Airtel");
		ai.calling();
		ai.data();*/
		
		/*Jio ji=(jio) a.getBean("jio");
		ji.calling();
		ji.data();*/
		
		Sim s=a.getBean("sim",Sim.class);
		s.calling();
		s.data();
		
		Sim s1=a.getBean("sim1",Sim.class);
		s1.calling();
		s1.data();
		

	}

}