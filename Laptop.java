package org.example;

public class Laptop implements Computer{

    //creating a Laptop class constructor
    public Laptop(){
        System.out.println("Laptop Constructor");
    }

   /* public void compile(){
        System.out.println("HI this is compile()");
    }*/

    public void compile(){
        System.out.println("HI this is compiling from Laptop");
    }

}
