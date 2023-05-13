package com.CodeCrusher.Proxy;
//concrete class
public class EmployeeDaoImp implements EmployeeDao{
	@Override
	public void create(String client , EmployeeDo obj) throws Exception{
		System.out.println("created new row in Employee");
	}
	@Override
	public void delete(String client , int EmployeeId) throws Exception{
		System.out.println("deleted row with employee id" + EmployeeId);
	}
	@Override
	public EmployeeDo get(String client , int EmployeeId) throws Exception{
		System.out.println("fetching data fro DB");
		return new EmployeeDo();
	}

}
