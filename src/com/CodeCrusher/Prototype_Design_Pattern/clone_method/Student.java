package com.CodeCrusher.Prototype_Design_Pattern.clone_method;

public class Student implements  Prototype<Student>{
	private int age;
	private String name;
	private String batch;
	private double averageBatchPsp;
	private double studentPsp;

	public Student(){}

	public Student(Student student){
		this.age = student.age;
		this.name = student.name;
		this.batch = student.batch;
		this.averageBatchPsp = student.averageBatchPsp;
		this.studentPsp = student.studentPsp;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setBatch(String batch) {
		this.batch = batch;
	}

	public void setAverageBatchPsp(double averageBatchPsp) {
		this.averageBatchPsp = averageBatchPsp;
	}

	public double getAverageBatchPsp() {
		return averageBatchPsp;
	}

	public void setStudentPsp(double studentPsp) {
		this.studentPsp = studentPsp;
	}

	public double getStudentPsp() {
		return studentPsp;
	}

	@Override
	public Student clone() {
		return new Student(this);
	}
}
