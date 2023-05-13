package com.CodeCrusher.Prototype_Design_Pattern.copy_constructor;

public class Intelligent_student extends student {
	int iq;
//	Intelligent_student(){
//		this.rollno = 100;
//		this.name = "z";
//		this.age = 20;
//		this.iq = 120;
//	}
//	Intelligent_student(int rollno , String name , int age, int iq){
//		this.rollno = rollno;
//		this.name = name;
//		this.age = age;
//		this.iq = iq;
//	}

	Intelligent_student(){
		this.rollno = 1;
		this.name = "Samantha";
		this.age = 12;
		//super(is);
		this.iq = 160;
	}
	Intelligent_student(student s){
//		this.rollno = 2;
//		this.name = "Cristine";
//		this.age = 52;
		super(s); // using this can access private attributes
		this.iq = 180;
	}

	public void m2(){
		System.out.println("He is intelligent");
	}
}
