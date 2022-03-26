package com.setterandgetter;

public class Department 
{
	private int deptid;
	private String name;
	public Department()
	{
	
	}
	// setter and getter method

	public int getDeptid() {
		return deptid;
	}


	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) 
	{
		Department d1=new Department();
		d1.setDeptid(45);
		d1.setName("TCS");
		System.out.println("DEPARTMENT ID:"+d1.getDeptid());
		System.out.println("DEPARTMENT NAME:"+d1.getName());

	}
}
