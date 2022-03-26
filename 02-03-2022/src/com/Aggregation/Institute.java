package com.Aggregation;

import java.util.*;

public class Institute 
{
	String instituteName;
    private List<Department> departments;
 
    // Constructor of institute class
    Institute(String instituteName,List<Department> departments)
    {
        // This keyword refers to current instance itself
        this.instituteName = instituteName;
        this.departments = departments;
    }
    public int getTotalStudentsInInstitute()
    {
        int noOfStudents = 0;
        List<Student> students;
 
        for (Department dept : departments) 
        {
            students = dept.getStudents();
 
            for (Student s : students) 
            {
                noOfStudents++;
            }
        }
 
        return noOfStudents;
    }
}
