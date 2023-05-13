package com.CodeCrusher.Sigleton_Design_Pattern;

public class LoggerSingleton {
	//version1
	/*
	//1> need to create a constructur private
	private LoggerSingleton(){

	}
	//2> to call the private constructur we use method getinstance
	public static LoggerSingleton getInstance(){
		return new LoggerSingleton();
	}
	 */

	/*
	//version2
	private static LoggerSingleton instance;
	private LoggerSingleton(){}

	public static LoggerSingleton getInstance(){
		if(instance == null)
			return new LoggerSingleton();
		return getInstance();
	}
	// why here two different objects are creating
	//because of java concurrency : Here two threads t1 and t2 trying to access an obj at same time and both
	// will come to the null obj and both try to create new object
	// so lets put a lock that is synchronized
	*/

	/*
	//version3
	private static LoggerSingleton instance;
	private LoggerSingleton(){}

	public static synchronized LoggerSingleton getInstance(){
		if(instance == null)
			return new LoggerSingleton();
		return getInstance();
	}
	*/

	/*
	 //version4 (Early initialization) Thread safe
	private static LoggerSingleton instance = new LoggerSingleton();
	private LoggerSingleton(){}

	public static LoggerSingleton getInstance(){
		return instance;
	}
	// this is creating single object

	 */
	//version5 (Double check Lock( Ideal solution)
	private static volatile LoggerSingleton instance = null;
	private LoggerSingleton(){
		if(instance != null){
			throw new RuntimeException("Please don't try to be smart ");
		}
	}

	public static LoggerSingleton getInstance(){
		if(instance == null) {
			synchronized (LoggerSingleton.class) {
				if (instance == null)
					instance = new LoggerSingleton();
			}
		}
		return instance;
	}
}
