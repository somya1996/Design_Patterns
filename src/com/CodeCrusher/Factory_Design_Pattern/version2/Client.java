package com.CodeCrusher.Factory_Design_Pattern.version2;

public class Client {
	//without using factory design pattern
	public static void main(String[] args) {
		//changes in version2 it will show error as db is not initialized
		Database db = new PostgreSQLDatabase();
		Query q = db.createquery();

		// changes from version 1
		/*
			Database db = new PostgreSQLDatabase();// shows error as db is not initialized
			Query q;

			if(db instanceof PostgreSQLDatabase) {
				q = new PostgreSQLQuery();
			}
			else if(db instanceof MySQLDatabase) {
				q = new MySQLQuery();
			}
		*/
	}
}
