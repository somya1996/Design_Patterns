package com.CodeCrusher.Factory_Design_Pattern.version1;

public class Client {
	//without using factory design pattern
	public static void main(String[] args) {
		Database db = new PostgreSQLDatabase();// shows error as db is not initialized
		Query q;

		if(db instanceof PostgreSQLDatabase) {
			q = new PostgreSQLQuery();
		}
		else if(db instanceof MySQLDatabase) {
			q = new MySQLQuery();
		}
		else{
			q = new PostgreSQLQuery();
		}
	}
}
