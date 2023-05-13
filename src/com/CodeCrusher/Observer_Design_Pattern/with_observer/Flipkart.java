package com.CodeCrusher.Observer_Design_Pattern.with_observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
	List<Order_Placed_Subscriber> order_placed_subscribers = new ArrayList<>();
	public void addSubscribers(Order_Placed_Subscriber orderPlacedSubscriber){
		order_placed_subscribers.add(orderPlacedSubscriber);
	}
	public void removeSubscribers(Order_Placed_Subscriber orderPlacedSubscriber){
		order_placed_subscribers.remove(orderPlacedSubscriber);
	}
	public void orderPlaced(Order order){
		for(Order_Placed_Subscriber opss : order_placed_subscribers){
			opss.onOrderPlaced(order);
		}
	}
}
