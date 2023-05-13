package com.CodeCrusher.Prototype_Design_Pattern.clone_method;

public class IntelligentStudent extends Student{
	int iq;
	public IntelligentStudent(){}
	public IntelligentStudent(IntelligentStudent student){
		super(student); // fill the attributes specific to parent
		this.iq = student.iq; // fill its own attributes
	}
	@Override
	public IntelligentStudent clone(){
		return new IntelligentStudent(this);
	}
}
