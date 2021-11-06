package com.orderfood.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.orderfood.model.Menu;

public class FoodItemCatalogImpl implements IFoodItemCatalog {
	
	Scanner sc=new Scanner(System.in);
	ArrayList<Menu> foodMenu=new ArrayList<>();
	ArrayList<Menu> cart=new ArrayList<>();
	private ArrayList<Menu> getfoodItems() {
		if(foodMenu.isEmpty()) {
	foodMenu.add(new Menu("F1","Pizza","fresh and delicious pizza","veg","300"));
	foodMenu.add(new Menu("F2","Non Veg Pizza","fresh and delicious pizza","non veg","350"));
	foodMenu.add(new Menu("F3","Fries","fresh and delicious fries","veg","90"));
		}
	return foodMenu;
	}
	

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		
		for(Menu m:getfoodItems()) {
			System.out.println(m);
		}
		addItemsToCart();
		System.out.println("do you want to add more items");
		String addMoreItems=sc.nextLine();
		if(addMoreItems.equalsIgnoreCase("Y")||addMoreItems.equalsIgnoreCase("yes")) {
			showMenu();
		}
		else {
			System.out.println("Items in cart");
			System.out.println(cart);
		}
		
	}


	private void addItemsToCart() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the item code to add the food item to cart");
		String item=sc.nextLine();
		cart.add(foodMenu.get(0));
		System.out.println("Item added to cart successfully");
		
		
		
		
	}

}
