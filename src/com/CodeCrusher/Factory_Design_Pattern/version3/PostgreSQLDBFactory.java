package com.CodeCrusher.Factory_Design_Pattern.version3;

public class PostgreSQLDBFactory implements DatabaseFactory{
	@Override
	public Query createQuery() {
		return new PostgreSQLQuery();
	}
}
