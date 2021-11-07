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
			for(Menu c:cart) {
			System.out.println(c);
			
			}
			
			System.out.println("Press 1 if you want to add more items");
			System.out.println("Press 2 if you want to delete an item");
			System.out.println("Press 3 if you want to proceed for payment");
			int addEditPayment=sc.nextInt();
			if(addEditPayment==1) {
				showMenu();
			}else if(addEditPayment==2) {
				editCart(cart);
				
			}else {
				payForItems(cart);
			}
			//try to find the bug here
		}
		
	}

	private void addItemsToCart() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the item code to add the food item to cart");
		int itemIndex = 0;
		String item=sc.nextLine();
		for(Menu findItem : foodMenu) {
			if(findItem.getItemId().equalsIgnoreCase(item)) {
				itemIndex=foodMenu.indexOf(findItem);
			}
		}
		
		cart.add(foodMenu.get(itemIndex));
		System.out.println("Item added to cart successfully");
		
		
	}

	private void editCart(ArrayList<Menu> cart) {
		// TODO Auto-generated method stub
		System.out.println("enter the item id of item you want to delete from cart");
		int itemIndex=0;
		String deleteItem=sc.next();
		for(Menu c:cart) {
			if(c.getItemId().equalsIgnoreCase(deleteItem)) {
				 itemIndex= cart.indexOf(c);
			}
		}
		cart.remove(itemIndex);
		System.out.println("press 1 to delete more item from cart");
		System.out.println("press 2 to proceed for payment");
		//at the point also we can take user to show menu
		int deleteOrPay=sc.nextInt();
		if(deleteOrPay==1) {
			editCart(cart);
			
		}else {
			payForItems(cart);
		}
		
		
		
	}


	private void payForItems(ArrayList<Menu> cart) {
		// TODO Auto-generated method stub
		int totalAmount=0;
		for(Menu amount:cart) {
			totalAmount=totalAmount+Integer.parseInt(amount.getPrice());
		}
		System.out.println("total amount to be paid "+totalAmount);
		
		Thread thread=new Thread();
		try {
			thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Payment done");
		System.out.println("Thanks for your Order !!!");
		
	}

}
