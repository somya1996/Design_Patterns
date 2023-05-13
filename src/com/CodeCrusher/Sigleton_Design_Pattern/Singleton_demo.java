package com.CodeCrusher.Sigleton_Design_Pattern;

public class Singleton_demo {
	public static void main(String[] args) {
		LoggerSingleton singletonobj1 = LoggerSingleton.getInstance();
		System.out.println(singletonobj1);

		LoggerSingleton singletonobj2 = LoggerSingleton.getInstance();
		System.out.println(singletonobj2);
	}
}
