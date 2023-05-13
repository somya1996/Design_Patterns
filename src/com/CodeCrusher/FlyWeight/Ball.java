package com.CodeCrusher.FlyWeight;

public class Ball {
	private String color;
	private String imageurl;
	private int coordX;
	private int coordY;
	private int radius;
	public Ball(String color , String imageurl){
		this.color = color;
		this.imageurl = imageurl;
	}
	public void setCoordX(int X){
		this.coordX = X;
	}
	public void setCoordY(int Y){
		this.coordY = Y;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	public void draw(){

	}
}
