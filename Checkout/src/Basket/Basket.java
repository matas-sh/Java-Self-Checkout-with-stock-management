package Basket;
import java.util.*;

public class Basket {
	private double balance;
	private boolean isEmpty = true;
	private ArrayList<Item> basket;
	
	public Basket()
	{
		basket = new ArrayList<Item>();
		balance = 0.0;
		System.out.println("basket created");
	}
	public boolean isEmpty()
	{
		return basket.isEmpty();
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
		if(!isEmpty())
		{
			if(basket.remove(item))
			{
				balance -= item.getPrice();
				System.out.println("item deleted");
			}
		}
		else
		{
			System.out.println("there is no item like this to delete");
		}
	}
	public void basketHolds()
	{
		if(!isEmpty())
		{
			for(Item e: basket)
			{
				System.out.println(e.getName());
			}
			System.out.println("current balance to pay £"+ getBalance());
		}
		else
		{
			System.out.println("There is nothing in the basket");
		}
	}
	public void voidItems()
	{
		if(!isEmpty())
		{
			for(int i=0; i<basket.size(); i++)
			{
				balance -= basket.get(i).getPrice();
				basket.remove(i);								
			}
		}
		else
		{
			System.out.println("There is nothing to void");
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
			deleteItem(e);
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