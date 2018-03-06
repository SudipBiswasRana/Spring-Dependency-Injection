package com.rana.DependencyInjectionWithSpring;

import java.util.List;

public class Shops {
	
	private  List<String> keyword;
    private String shopName ;
    
	public Shops(String shopName, List<String> keyword) {
		super();
		this.keyword = keyword;
		this.shopName = shopName;
	}

	public List<String> getKeyword() {
		return keyword;
	}

	public void setKeyword(List<String> keyword) {
		this.keyword = keyword;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
}
