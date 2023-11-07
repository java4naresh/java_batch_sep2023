package org.naresh.corejava.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Order implements Externalizable {
	
	private String orderName;
	
	private String address;
	
	private int quantity;
	
	private String item;
	
	private String brand;

	public Order() {
		super();
	}

	public Order(String orderName, String address, int quantity, String item, String brand) {
		super();
		this.orderName = orderName;
		this.address = address;
		this.quantity = quantity;
		this.item = item;
		this.brand = brand;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Order [orderName=" + orderName + ", address=" + address + ", quantity=" + quantity + ", item=" + item
				+ ", brand=" + brand + "]";
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		orderName = (String)in.readObject();
		quantity = in.readInt();
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(orderName);
		out.writeInt(quantity);
		out.writeObject(address);
		out.writeObject(item);
		out.writeObject(brand);
	}

}
