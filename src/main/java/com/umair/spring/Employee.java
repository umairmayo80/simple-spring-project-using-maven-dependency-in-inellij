package com.umair.spring;

//POJO (Plain old java Object), or Bean or Model
public class Employee {
    private String name;
    private int id;
    private int salary;
    private Address address;

    // The constructors, setter and getter methods are used by IOC (Inversion of control) or spring core container to create the object
    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employee() {
    }


    public Employee(String name, int id, int salary, Address address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = address;
    }


    // Constructor injection
    public Employee(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    // setter injection
    public void setAddress(Address address) {
        this.address = address;
    }

    //    custom init method that can we used to initialize the object
    public void myInit(){
        System.out.println("My init function called");
        // other code...
    }

    // custom destroy methods to perform custom clean  up
    public void myDestory(){
        System.out.println("My destroy function called");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
