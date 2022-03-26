package com.setter;

public class Employee
{
    private int id;
    private String name;
    private double salary;
    public Employee() 
    {
		
	}
    // setter method
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void getinfo()
	{
		System.out.println("EMPLOYEE ID:"+id);
		System.out.println("EMPLOYEE NAME :"+name);
		System.out.println("EMPLOYEE SALARY:"+salary);
	}

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.setId(456);
		e1.setName("Divi");
		e1.setSalary(9865.23);
		e1.getinfo();

	}

}
