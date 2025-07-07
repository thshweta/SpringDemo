package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {

         /*Dev obj;
        obj.build();*/


        //we'll create the ioc container using ApplicationContext
        //for using ApplicationContext we need to add spring context dependency
        //ApplicationContext is an Interface

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       /* Dev obj = context.getBean(Dev.class);
        obj.build();

        Laptop obj1 = context.getBean(Laptop.class);
        obj1.compile();*/
//----------------------------------------------------------------------------------------------------------------
        Dev obj = context.getBean(Dev.class);

        //obj.age = 18; //we can also assign value from here
       // System.out.println(obj.age());

        //after using private
     //   obj.setAge(19); //even if don't assign value here the output will come 0 instead of error
       // System.out.println(obj.getAge());

        //but we don't want to assign values like this instead
       //we want assign the value with the help of SPRING so we'll INJECT the value in spring.xml file

        obj.build();

    }
}
