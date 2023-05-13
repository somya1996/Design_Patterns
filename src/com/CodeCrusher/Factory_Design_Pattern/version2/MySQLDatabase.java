package com.CodeCrusher.Factory_Design_Pattern.version2;

public class MySQLDatabase implements Database {
	@Override
	public Query createquery() {
		return new MySQLQuery();
	}
}
