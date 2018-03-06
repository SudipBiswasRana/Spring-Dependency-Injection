package com.rana.DependencyInjectionWithSpring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	 private static final String SHOP_NAME="Coke A";
	 
	 public static void main(String [] args)
	 {
		 
		 ApplicationContext ctn = new ClassPathXmlApplicationContext("application_context.xml");
		 ShopLocator shopLocator = ctn.getBean("beanShopLocator",ShopLocator.class);
		 
		 List<Shops> shops = shopLocator.find(SHOP_NAME, "2222");
		 
		 for(Shops shop : shops)
		 {
			 System.out.println("Search Shows  "+shop.getShopName() +"\n"
					 +"And  Products Available  "+shop.getKeyword());
		 }
	 }
}
