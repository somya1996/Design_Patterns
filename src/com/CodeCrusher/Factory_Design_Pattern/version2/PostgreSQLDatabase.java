package com.CodeCrusher.Factory_Design_Pattern.version2;


public class PostgreSQLDatabase implements Database {
	@Override
	public Query createquery() {
		return new PostgreSQLQuery();
	}
}
