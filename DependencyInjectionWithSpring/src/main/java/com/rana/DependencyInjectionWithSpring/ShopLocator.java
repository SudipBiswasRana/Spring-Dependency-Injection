package com.rana.DependencyInjectionWithSpring;

import java.util.ArrayList;
import java.util.List;

public class ShopLocator {

	private DelegatingDependecy depends;

	public ShopLocator(DelegatingDependecy depends) {
		super();
		this.depends = depends;
	}
	
	public List<Shops> find (String shopName , String zipCode)
	{
		List<Shops> shops = this.depends.find(zipCode);
		List<Shops> outcome = new ArrayList<Shops>();
		
		for(Shops shop : shops)
		{
			if (shop.getShopName().contains(shopName))
			{
				outcome.add(shop);
			}
		}
		return outcome;
	}
	
}
