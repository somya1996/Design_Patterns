package com.CodeCrusher.Builder_Design_Pattern;

public class URL {
	private String protocol;
	private String hostname;
	private String port;
	private String pathParam;
	private String queryParam;
	public URL(){

	}
	public URL(String protocol){
		this.protocol = protocol;
	}
	public URL(String protocol , String hostname){
		this.protocol = protocol;
		this.hostname = hostname;
	}
	public URL(String protocol , String hostname , String port){
		this.protocol = protocol;
		this.hostname = hostname;
		this.port = port;
	}
	public URL(String protocol , String hostname , String port , String pathParam ){
		this.protocol = protocol;
		this.hostname = hostname;
		this.port = port;
		this.pathParam = pathParam;
	}
	public URL(String protocol , String hostname , String port , String pathParam , String queryParam ){
		this.protocol = protocol;
		this.hostname = hostname;
		this.port = port;
		this.pathParam = pathParam;
		this.queryParam = queryParam;
	}
	public void setprotocol(String protocol){
		this.protocol = protocol;
	}
	public String getprotocol(){
		return this.protocol;
	}
	public void sethostname(String host){
		this.hostname  = host;
	}
	public String gethostname(){
		return this.hostname;
	}
	public void setport(String port){
		this.port = port;
	}
	public String getport(){
		return this.port;
	}
	public void setpathParam(String path){
		this.pathParam = path;
	}
	public String getpathParam(){
		return this.pathParam;
	}
	public void setqueryParam(String query){
		this.queryParam = query;
	}
	public String getqueryParam(){
		return this.queryParam;
	}
}
