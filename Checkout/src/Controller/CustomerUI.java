package Controller;
import java.util.Scanner;

import Basket.*;

public class CustomerUI extends UI{
	private String[] options = { "Add", "Status", "Delete", "Checkout", "Void", "Exit"}; 
	private Scanner userInput;
	private Basket customerBasket;
	public CustomerUI(Scanner scanner, Basket basket)
	{
		super(scanner, basket);
		System.out.println("Welcome Cusotmer, What would you like to buy?");
		userInput = scanner;
		customerBasket = basket;
		

	}
	public boolean completeAction(int input)
	{
				Item defautItem = new NonParishable("Cracker Bread", 2.20, 1, new Date(13, 02, 2018), 2.17);
		
				int userStep = input;
				if(userStep== 1) 
				{
					System.out.println("which item would you like to add?");
					customerBasket.addItem(defautItem);
				}
				if(userStep== 2)
				{
					System.out.println("Which item would you like to delete");
					customerBasket.deleteItem(defautItem);
				}
				if(userStep== 3)
				{
					customerBasket.basketHolds();
				}
				if(userStep== 4)
				{
					String receipt = customerBasket.Checkout(50.0);
					System.out.println(receipt);
					
				}
				if(userStep == 5)
				{
					customerBasket.voidItems();
					customerBasket.basketHolds();
				}
				if(userStep == 6)
				{
					return false;
				}
				if(userStep == 7)
				{
					System.out.println("invalid command, please try again available options are: ");
		
				}
				return true;
			}

public int inputChecker(String comparable)
{
	switch(comparable)
	{
	case "Add":
		return 1;
	case "Delete":
		return 2;
	case "Status":
		return 3;
	case "Checkout":
		return 4;
	case "Void":
		return 5;
	case "Exit":
		return 6;
	}
	return 7;
}
public void showOptions()
{

	for(String element: options)
	{
		System.out.println("-"+element);
	}

}
}
