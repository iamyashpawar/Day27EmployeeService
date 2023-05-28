package com.bridgelabz;

import java.util.Scanner;

public class PayrollService {

    Employee employee =new Employee();
    Scanner sc = new Scanner(System.in);

    public void employee(){
        System.out.println("Enter a Employee Name: ");
        String name =sc.next();

        System.out.println("Enter a Salary ");
        double salary= sc.nextDouble();

        employee.setName(name);
        employee.setSalary(salary);
    }







}
