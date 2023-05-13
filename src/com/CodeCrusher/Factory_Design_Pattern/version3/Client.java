package com.CodeCrusher.Factory_Design_Pattern.version3;

import javax.xml.parsers.DocumentBuilder;

public class Client {
	public static void main(String[] args) {
		Database db = null;

		DatabaseFactory dbf = db.createDatabaseFactory();
//        same error as version1
//        if (db instanceof MySQLDatabase) {
//            dbf = new MySQLDBFactory();
//        } else if (db instanceof PostgreSQLDatabase) {
//            dbf = new PostgreSQLDBFactory();
//        }

		Query q = dbf.createQuery();

	}
}
