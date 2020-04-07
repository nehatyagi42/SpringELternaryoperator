package com.rtpl.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("itemBean")
public class Item {

	@Value("99")
	private int qtyOnhand;

	public int getQtyOnhand() {
		return qtyOnhand;
	}

	public void setQtyOnhand(int qtyOnhand) {
		this.qtyOnhand = qtyOnhand;
	}
	
	
	
	
	
}
