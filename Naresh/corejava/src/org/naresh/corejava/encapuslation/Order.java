package org.naresh.corejava.encapuslation;

public class Order {
	
	private int id;
	private String orderName;
	private double orderPrice;
	private String address;
	
	public Order(int id, String orderName, double orderPrice, String address) {
		this.id = id;
		this.orderName = orderName;
		this.orderPrice = orderPrice;
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
	public String getOrderName() {
		return orderName;
	}
	
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	public double getOrderPrice() {
		return orderPrice;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	

}
