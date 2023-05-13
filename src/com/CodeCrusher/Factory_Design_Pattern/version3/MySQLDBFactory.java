package com.CodeCrusher.Factory_Design_Pattern.version3;

public class MySQLDBFactory implements DatabaseFactory{
	@Override
	public Query createQuery() {
		return new MySQLQuery();
	}
}
