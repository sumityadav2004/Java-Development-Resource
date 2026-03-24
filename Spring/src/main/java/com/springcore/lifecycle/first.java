package com.springcore.lifecycle;

public class first {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public first() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "first [price=" + price + "]";
}

public void init() {
	System.out.println("Inside init method");
}

public void destroy() {
	System.out.println("Inside destroy method"); 
}

}
