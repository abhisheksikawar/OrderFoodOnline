package com.orderfood.main;

import java.util.Scanner;

import com.orderfood.service.FoodItemCatalogImpl;
import com.orderfood.service.IFoodItemCatalog;
import com.orderfood.service.ILogin;
import com.orderfood.service.LoginImpl;

public class OrderFoodOnlineMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ILogin login = new LoginImpl();
		IFoodItemCatalog catalog=new FoodItemCatalogImpl();
		Thread thread =new Thread();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome");
		thread.sleep(1000);
		System.out.println("Order your Food Online");
		thread.sleep(1000);
		System.out.println("Please login to order food");
		thread.sleep(1000);
		System.out.println("Enter your User Name");
		String userName=sc.nextLine();
		System.out.println("Enter your Passsword");
		String password=sc.nextLine();
		
		boolean result=login.verifyUser(userName, password);
		if(result==true) {
			System.out.println("login successfull");
			catalog.showMenu();
			
		}else {
			System.out.println("login failed.please try again with correct username/password");
		}

	}

}
