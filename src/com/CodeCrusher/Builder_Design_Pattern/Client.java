package com.CodeCrusher.Builder_Design_Pattern;

public class Client {
	public static void main(String[] args) {
		URL url = new URL();
		url.setprotocol("https://");
		url.sethostname("mywebsite:");
		url.setport("8080/");
		url.setpathParam("companies?");
		url.setqueryParam("companymyName=xyz");

//		System.out.print(url.getprotocol());
//		System.out.print(url.gethostname());
//		System.out.print(url.getport());
//		System.out.print(url.getpathParam());
//		System.out.print(url.getqueryParam());


		URLBuilder.Builder builder = new URLBuilder.Builder();
		builder.protocol("https://").hostname("mywebsite:").port("404");
		URLBuilder urlbuilder = builder.build();
		System.out.print(urlbuilder.protocol);
		System.out.print(urlbuilder.hostname);
		System.out.print(urlbuilder.port);

	}
}
