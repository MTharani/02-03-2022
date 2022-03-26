package com.Aggregation;

import java.util.*;
public class GFG {

	public static void main(String[] args) 
	{
		Student s1 = new Student("Thara", 1, "CSE");
        Student s2 = new Student("Priya", 2, "CSE");
        Student s3 = new Student("Devi", 1, "ECE");
        Student s4 = new Student("abi", 2, "ECE");
        
 
        // Creating a List of CSE Students
        List<Student> cse_students = new ArrayList<Student>();
 
        // Adding CSE students
        cse_students.add(s1);
        cse_students.add(s2);
        
 
        // Creating a List of EE Students
        List<Student> ee_students = new ArrayList<Student>();
 
        // Adding ECE students
        ee_students.add(s3);
        ee_students.add(s4);
        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);
 
        List<Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);
 
        // Lastly creating an instance of Institute
        Institute institute = new Institute("PKIET", departments);
 
        // Display message for better readability
        System.out.print("Total students in institute: ");
 
        // Calling method to get total number of students
        // in institute and printing on console
        System.out.print(institute.getTotalStudentsInInstitute());
    

	}

}
