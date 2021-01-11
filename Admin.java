package com.capgemini.admin;
import com.capgemini.services.StudentSchedular;
import java.util.Scanner;
public class Admin
{
	private static Scanner sc = new Scanner(System.in);
	private static StudentSchedular lar = new StudentSchedular();
	public static void main(String[] args)
	{
		showMenu();
	}
	private static void showMenu()
	{
		System.out.println("1. Add Student Details"+ "2. Show all Student Details\n"+
				"3. Display Students Details by Roll Number\n " + "4. Display Student Details by Course Name\n" 
				+ "5. Show Count of Courses\n " + "6. Exit");
		System.out.println("Enter Your Choice");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: lar.addStudent();
			break;
		}
	}

}
