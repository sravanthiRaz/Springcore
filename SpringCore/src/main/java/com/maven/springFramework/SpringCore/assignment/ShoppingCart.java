package com.maven.springFramework.SpringCore.assignment;

public class ShoppingCart {
private Items items;

public Items getItems() {
	return items;
}

public void setItems(Items items) {
	this.items = items;
}

@Override
public String toString() {
	return "ShoppingCart [items=" + items + "]";
}

}
