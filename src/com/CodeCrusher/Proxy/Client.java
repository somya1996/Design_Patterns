package com.CodeCrusher.Proxy;

public class Client {
	public static void main(String[] args) {
		try{
			EmployeeDao empTableobj = new EmployeeDaoProxy();
			empTableobj.create("USER", new EmployeeDo());
			System.out.println("OPERATION SUCCESSFUL");
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
