package com.setterandgetter;

public class Employee 
{
	private int id;
    private String name;
    private double salary;
    
    //constructor
    public Employee() 
    {
		
	}
    // setter method and getter method
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	//main method
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.setId(562);
		e1.setName("Divi");
		e1.setSalary(8865.23);
		System.out.println("ID:"+e1.getId());
		System.out.println("NAME"+e1.getName());
		System.out.println("salary"+e1.getSalary());
		
	}
}
