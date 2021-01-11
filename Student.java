package com.capgemini.beans;

public class Student
{
	private int RollNum ;
	private String StudName;
	private String[] Courses;
	
	public int getRollNum()
	{
		return RollNum;
	}
	public void setRollNum(int RollNum)
	{
		this.RollNum = RollNum;
	}
	
	public String getStudName()
	{
		return StudName;
	}
	public void setStudName( String StudName)
	{
		this.StudName = StudName;
	}
	public String[] getCourses()
	{
		return Courses;
	}
	public void setCourses(String [] Courses)
	{
		this.Courses = Courses;
	}

}
