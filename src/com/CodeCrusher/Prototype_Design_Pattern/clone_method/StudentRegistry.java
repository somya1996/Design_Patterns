package com.CodeCrusher.Prototype_Design_Pattern.clone_method;

import java.util.HashMap;


	public class StudentRegistry{
		private HashMap<String, Student> map = new HashMap<>();

		void register(String key, Student student) {
			map.put(key, student);
		}

		Student get(String key) {
			return map.get(key);
		}
	}
