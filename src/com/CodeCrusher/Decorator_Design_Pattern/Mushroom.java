package com.CodeCrusher.Decorator_Design_Pattern;

public class Mushroom implements Topping_Decorator{
	Base_Pizza pizza;
	Mushroom(Base_Pizza pizza){
		this.pizza = pizza;
	}
	@Override
	public int cost(){
		return this.pizza.cost()+80;
	}
}
