package com.setterandtostring;



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
	//ToString method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.setId(562);
		e1.setName("Divi");
		e1.setSalary(8865.23);	
		System.out.println(e1.toString());
	}
	

}
