package org.example;

public class Dev {
/*
   // private Laptop laptop; //this is only reference and we want spring to give Laptop's object


    private Laptop laptop; //to use outside assign getter&setter

   // int age = 8; //not the ideal way of assigning
   //ideal way of assigning variable and can't be directly accessed outside the class without getter & setter
    private int age;

    //creating a class constructor(default)
    public Dev(){
        System.out.println("Dev Constructor");
    }

    //creating a parameterized constructor
//    public Dev(int age) { //taking parameter age and now we'll inject the value with constructor not setter
//        this.age = age;
//        System.out.println("Dev parameterized constructor");
//    }
//------------------------------------------------------------------

    public Dev(Laptop laptop) { //for constructor injection reference
        this.laptop = laptop;
        System.out.println("Dev parameterized constructor");
    }



    //------------------------------------------
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    *//*  public void build(){
        System.out.println("We are working on an awesome project!");
        laptop.compile(); //It won't work beccause we only have reference of Laptop and not the object
    }*//*

//-------------------------------------------------------
    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        System.out.println("We are working on an awesome project!");
        laptop.compile();*/

//------------------------------------------------------------------------------------------------------------------------

    public Computer comp;

    public Dev(){
        System.out.println("Dev Constructor");
    }

    public Computer getComp() {return comp;}
    public void setComp(Computer comp) {this.comp = comp;}


    public void build(){
        System.out.println("Working on an awesome project");
        comp.compile();
    }

}

