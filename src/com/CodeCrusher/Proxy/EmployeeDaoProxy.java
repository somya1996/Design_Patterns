package com.CodeCrusher.Proxy;

public class EmployeeDaoProxy implements EmployeeDao{
	EmployeeDao employeeobj;
	EmployeeDaoProxy(){
		employeeobj = new EmployeeDaoImp();
	}
	@Override
	public void create(String client , EmployeeDo obj) throws Exception{
		if(client.equals("ADMIN")){
			employeeobj.create(client, obj);
			return;
		}
		throw new Exception("Access DENIED");

	}
	@Override
	public void delete(String client , int employeeId) throws Exception{
		if(client.equals("ADMIN")){
			employeeobj.delete(client, employeeId);
			return;
		}
		throw new Exception("Access DENIED");
	}
	@Override
	public EmployeeDo get(String client , int employeeId) throws Exception{
		if(client.equals("ADMIN") || client.equals("USER")){
			return employeeobj.get(client , employeeId);
		}
		throw new Exception("ACCESS DENIED");
	}
}
