package com.CodeCrusher.Prototype_Design_Pattern.copy_constructor;

public class student{
	 int rollno;
	 String name;
	 int age;
	student(){
		this.rollno = 0;
		this.name = "a";
		this.age = 0;
	}
	student(int rollno , String name , int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	student(student s){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	student(Intelligent_student is){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public void m1(){
		System.out.println("Original student");
	}
	public void setrollno(int rollno){
		this.rollno = rollno;
	}
	public int getrollno(){
		return this.rollno;
	}
	public void setname(String rollno){
		this.name = name;
	}
	public String getname(){
		return this.name;
	}
	public void setage(int age){
		this.age = age;
	}
	public int getage(int age){
		return this.age;
	}
	public student clone(student s){
		return new student(this);
	}
}
