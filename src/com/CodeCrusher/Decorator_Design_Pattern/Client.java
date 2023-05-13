package com.CodeCrusher.Decorator_Design_Pattern;

public class Client {
	public static void main(String[] args) {
		Base_Pizza pizza = new ExtraCheese(new Mushroom(new ExtraCheese(new Veg_Delight())));
		System.out.println(pizza.cost());
	}
}
