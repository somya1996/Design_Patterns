package com.CodeCrusher.FlyWeight;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class FlyweightDemo {
	public static final String color[] = {"Green" , "Yellow" , "Pink"};
	public static final Map<String,String> urlMap = Map.ofEntries(
			new AbstractMap.SimpleEntry<String,String>("Green" , "url1"),
			new AbstractMap.SimpleEntry<String,String>("Yellow" , "url2"),
			new AbstractMap.SimpleEntry<String,String>("Pink" , "url3")
	);

	public static void main(String[] args) {
		for(int i=0; i<10; i++){
			String color = getColor();
			String url = urlMap.get(color);
			Ball ball = (Ball)BallFactory.getBall(color,url);
			ball.setCoordX(getX());
			ball.setCoordY(getY());
			ball.setRadius(75);
			ball.draw();
			System.out.println(ball.hashCode());
		}
	}
	private static String getColor(){
		return color[(int)(Math.random()*color.length)];
	}
	private static int getX(){
		return (int)(Math.random()*50);
	}
	private static int getY(){
		return (int)(Math.random()*50);
	}
}
