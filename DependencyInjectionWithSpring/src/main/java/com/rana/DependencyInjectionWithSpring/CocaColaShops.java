package com.rana.DependencyInjectionWithSpring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CocaColaShops implements DelegatingDependecy
{   
	 private static List<Shops> shopLocation = new ArrayList<Shops>();
	 
	 static {
		 shopLocation.add(new Shops("Coke A",Arrays.asList("A" ,"D")));
		 shopLocation.add(new Shops("Coke B",Arrays.asList("AA" ,"DD")));
		 shopLocation.add(new Shops("Coke C",Arrays.asList("AAA" ,"DDD")));
		 shopLocation.add(new Shops("Coke D",Arrays.asList("AAAA" ,"DDDD")));		 
	 }

	public List<Shops> find(String zipCode) {
		
		return shopLocation;
	}


}



// locations.add(new RentalLocation("Kiosk A", Arrays.asList("Forest Gump", "Speed")));