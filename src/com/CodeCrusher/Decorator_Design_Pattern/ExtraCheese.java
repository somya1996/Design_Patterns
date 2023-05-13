package com.CodeCrusher.Decorator_Design_Pattern;

public class ExtraCheese implements Topping_Decorator{
	Base_Pizza pizza;
	ExtraCheese(Base_Pizza pizza){
		this.pizza = pizza;
	}
	@Override
	public int cost(){
		return pizza.cost() + 20;
	}
}
