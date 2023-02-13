package com.sun;
class Employee{//define the Instance Variable
	long employeeId;    // instance variable
	String employeeName;    // instance variable
	String employeeAddress;    // instance variable
	long employeePhone;    // instance variable
	double basicSalary;    // instance variable
	double specialAllowance=250.80;//Defined and Initialize the value of special Allowance
	double hra=1000.50;//Initialize and define the value of hra
	Employee(long id,String name,String address,long phone){//overloaded constructor in the employee class
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;
	}
	public void calculateSalary() {//Method to calculate salary 
		double salary=basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
		System.out.println(salary);
	}
	public void calculateTransportAllowance() {//Method to calculate Transport Allowance
		double transportAllowance = 10*basicSalary/100;
		System.out.println(transportAllowance);
		
	}
}
class Manager extends Employee{

	Manager(long id, String name, String address, long phone,long basicSalary) {//define the constructor of Maager class
		super(id, name, address, phone);//Invoke the constructor of Employee class 
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;
		this.basicSalary=basicSalary;
	}
	public void calculateTransportAllowance() {//Method to calculate the Transport Allowance of Manager
		double transportAllowance = 15*basicSalary/100;
		System.out.println(transportAllowance);
		
	}
	
}
class Trainee extends Employee{//Class that extends the properties of Employee

	Trainee(long id, String name, String address, long phone,long basicSalary) {//Constructor for the Trainee class
		super(id, name, address, phone);
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;
		this.basicSalary=basicSalary;
	}
	
	
}
public class InheritanceActivity {

	public static void main(String[] args) {
		Manager m=new Manager(126534,"Peter","Chennai India",237844,65000);//Object Creation of Manager class
		System.out.println("Basic Salary of Manager is : " + m.basicSalary);//Printing the basic salary of Manager
		System.out.println("Salary of Manager :"  );//Manager Salary
		m.calculateSalary();
        System.out.print("Transport Allowance of Manager is :  ");
        m.calculateTransportAllowance();//Calling the TransportAllowance Method
        Trainee t = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);//object creation of Trainee class
        System.out.print("Trainee's Basic Salary: "+t.basicSalary);//Printing Basic Salary of Trainee
        System.out.print("\n Salary of Trainee is : ");//Actual Salary of Trainee
        t.calculateSalary();
        System.out.print("Transport Allowance of Trainee is  ");//Printing the Transport Allowance of Trainee
        t.calculateTransportAllowance();//calling TransportAllowance Method


	}

}
