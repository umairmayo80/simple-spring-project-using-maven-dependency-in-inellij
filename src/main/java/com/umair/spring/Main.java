package com.umair.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("spring");


        Employee e = new Employee("Ali",1,1000);
        System.out.println(e);



        // Steps for Spring Inversion of Control (IOC)
        // 1. Add spring dependency using maven
        // 2. Configure Java Objects in an XML file or using annotations, we are using XML file in this case
        // 3. Use Spring IOC Container, e.g BeanFactory or ApplicationContext to ge the objects constructed by them


        System.out.println("--------Spring IOC in Action");

        ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");

        // we can update the employee data by changing the .xml file without needing to recompile
        Employee e1 = (Employee) context.getBean("emp1");

        Employee e2 = context.getBean("emp2",Employee.class);

        System.out.println(e1);
        System.out.println(e2);



    }
}
