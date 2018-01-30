package Basket;
import java.util.*;

public class Basket {
	private double balance;
	private ArrayList<Item> basket;
	
	public Basket()
	{
		basket = new ArrayList<Item>();
		balance = 0.0;
		System.out.println("basket created");
	}
	public void addItem(Item item)
	{
		if(basket.add(item))
		{
			balance += item.getPrice();
			System.out.println("item added");
		}
	}

	public void deleteItem(Item item)
	{
		if(basket.remove(item))
		{
			balance -= item.getPrice();
			System.out.println("item deleted");
		}
	}
	public void basketHolds()
	{
		for(Item e: basket)
		{
			System.out.println(e.getName());
		}
		System.out.println("current balance to pay £"+ getBalance());
	}
	public void voidItems()
	{
		for(Item e: basket)
		{
			basket.remove(e);
		}
		if(basket.isEmpty())
		{
			balance = 0.0;
		}
	}
	public String Checkout(double customerMoney)
	{
		String receipt ="";
		
		if(customerMoney < balance)
		{
			receipt="please insert £"+ (balance - customerMoney) +" to purchase the products";
			return receipt;
		}
		receipt ="you have Bought the following items:"+'\n';
		for(Item e: basket)
		{
			receipt+= (e.getName()+"  "+e.getPrice()+"  "+e.getCode());
			receipt+= '\n';
		}
		if(customerMoney > balance)
		{
			receipt += "your change is £"+ (customerMoney- balance)+". Thank you for your purchase "+'\n';
		}
		else
		{
			receipt += "Thank you for your purchase";
		}
		return receipt;
	}

	public double getBalance()
	{
		return balance;
	}
}