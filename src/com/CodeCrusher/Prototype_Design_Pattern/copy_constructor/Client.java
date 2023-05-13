package com.CodeCrusher.Prototype_Design_Pattern.copy_constructor;

public class Client {
	public static void main(String[] args) {
		student s = new student();
		student copy = null;

		if(s instanceof student)
			copy = new student(s);
		else if (s instanceof Intelligent_student)
			copy = new Intelligent_student(s);

		copy.m1();
	}
}
