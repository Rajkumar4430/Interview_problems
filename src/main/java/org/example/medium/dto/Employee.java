package org.example.medium.dto;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    //Getters
    public int getId() {return id;}
    public String getName() {return name;}
    public double getSalary() {return salary;}
    public String getDepartment() {return department;}

    //toString
    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

}
