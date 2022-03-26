package com.Association;

public class GFG
{

	public static void main(String[] args) {
		 Bank bank = new Bank("ICICI");
		 Employee emp=new Employee("DIVI");
		 System.out.println(emp.getEmployeeName()+"is employee of"+bank.getBankName());

	}

}
