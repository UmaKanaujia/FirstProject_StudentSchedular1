package com.capgemini.services;
import com.capgemini.beans.Student;
import java.util.Scanner;

public class StudentSchedular
{
	//Scanner sc = new Scanner(System.in)
	//i = sc.nextInt();
	//str = sc.NextLine();
	
	
	int i ;
	Scanner sc = new Scanner(System.in);
	Student[] stdData= null;
	public void addStudent(int RollNum, String StudName, String Courses)
	{
		//System.out.println("Enter Number of Students");
		//i = sc.nextInt();
		System.out.println("Enter the number of Students you want ot add:");
		int countStud = sc.nextInt();
		for(i=0; i<countStud;i++)
		{
			stdData[i] = new Student( RollNum, StudName, Courses ); 
			
		}
		
				
		
	}
	public void validateRollNum()
	{
		System.out.println("Validate Roll number function");
	}
	public void showAllStudente() 
	{
		System.out.println("Show All Student function");
	}
	public void showByRollNum()
	{
		System.out.println("Show all roll number function");
	}
	public void showByCourse()
	{
		System.out.println("Show By COurses function");
	}
	public void countByCourse()
	{
		System.out.println("Count by Course function");
	}

}
