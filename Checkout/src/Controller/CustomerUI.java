package Controller;
import java.util.Scanner;

import Basket.*;

public class CustomerUI {
	private boolean IsEmpty, transactionCompeleted = false;
	private static String[] options = { "Add", "Status", "Delete", "Checkout", "Exit"}; 
	public CustomerUI()
	{

	}
	public static void main(String[] args)
	{
		CustomerUI ui = new CustomerUI();
		boolean finish= false;
		Basket basket = new Basket(); 
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome, What would you like to do?");
		ui.showOptions();
		while(!finish)
		{
			int userStep = ui.inputChecker(userInput.nextLine());
			if(userStep== 1)
			{
				System.out.println("which item would you like to add?");
				basket.addItem(new NonParishable("Cracker Bread", 2.20, 1, new Date(13, 02, 2018), 2.17));
			}
			if(userStep== 2)
			{
				System.out.println("Which item would you like to delete");
				basket.deleteItem(new NonParishable("Cracker Bread", 2.20, 1, new Date(13, 02, 2018), 2.17));
			}
			if(userStep== 3)
			{
				basket.basketHolds();
			}
			if(userStep== 4)
			{
				basket.Checkout(50.0);
			}
			if(userStep== 5)
			{
				finish = true;
			}
			if(userStep == 6)
			{
				System.out.println("invalid command, please try again available options are: ");
				
			}
			ui.showOptions();

		}
		//terminates the program
		System.exit(0);
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
		case "Exit":
			return 5;
		}
		return 6;
	}
	public void showOptions()
	{

		for(String element: options)
		{
			System.out.println("-"+element);
		}

	}
}
