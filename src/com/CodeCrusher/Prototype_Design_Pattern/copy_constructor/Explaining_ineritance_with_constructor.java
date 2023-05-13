package com.CodeCrusher.Prototype_Design_Pattern.copy_constructor;

public class Explaining_ineritance_with_constructor {
	public static void main(String[] args) {
		/**case1**/
		student s = new student(20,"Somya",23);
		System.out.println(s.rollno+ " " + s.name + " " +s.age);
		s.m1();
		System.out.println();

		/**case2**/
		Intelligent_student is = new Intelligent_student();
		System.out.println(is.rollno+" "+is.name+" "+is.age+" "+is.iq);
		is.m1();
		is.m2();
		System.out.println();

		/**case3**/
		student s1 = new Intelligent_student();
		System.out.println(s1.rollno+" "+s1.name+" "+s1.age);// here calling iq attribute and m2 function not possible
		System.out.println();

		/**case4**/
		//Intelligent_student is1 = new student(); throws compile time error cant call parent object from chil refrence

		/**case5 copy constructor **/
		student s2 = new student(is);
		System.out.println("s2 refrence  and  passing intelligent refrence obect");
		System.out.println(s2.rollno+" "+s2.name+" "+s2.age);// only print those attr that are present in parent
		s2.m1();
		System.out.println();

		student s3 = new student(s);
		System.out.println("s3 refrence passing refrence object of student s");
		System.out.println(s3.rollno+" "+s3.name+" "+s3.age);
		s3.m1();
		System.out.println();

		student s4 = new Intelligent_student(is);
		System.out.println("s4 refrence passing refrence object of intelligebt student is");
		System.out.println(s4.rollno+" "+s4.name+" "+s4.age);
		s4.m1();
		System.out.println();

		student s5 = new Intelligent_student(s);
		System.out.println("s5 refrence passing refrence object of intelligebt student is");
		System.out.println(s5.rollno+" "+s5.name+" "+s5.age);
		s5.m1();
		System.out.println();

		Intelligent_student is2 = new Intelligent_student(s);
		System.out.println(is2.rollno+" "+is2.name+" "+is2.age+" "+is2.iq);
		is2.m1();
		is2.m2();
		System.out.println();
	}
}
