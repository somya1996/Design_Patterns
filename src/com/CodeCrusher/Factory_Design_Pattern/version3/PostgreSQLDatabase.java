package com.CodeCrusher.Factory_Design_Pattern.version3;

public class PostgreSQLDatabase implements Database {
	@Override
	public DatabaseFactory createDatabaseFactory() {
		return new PostgreSQLDBFactory();
	}
}
