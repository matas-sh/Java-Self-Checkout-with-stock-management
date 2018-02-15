package Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import Basket.Basket;

public class Controller {
	private static String[] options = {"Admin", "Customer", "GUI", "Exit"};
	public static void main(String[] args) {
		Controller cont = new Controller();
		Scanner userInput = new Scanner(System.in);	
		Basket basket = new Basket();
		System.out.println("what mode would you like to start" +'\n');
		cont.start(cont, basket, userInput);
	
	}
	
	public void start(Controller controller, Basket basket, Scanner userInput)
	{
		boolean finished = false;
		Controller cont = controller;
		cont.showOptions(options);
		UI ui = cont.chooseUI(cont.evaluateMenuInput(userInput.nextLine()), basket, userInput);
		while(!finished)
		{
			if(ui instanceof CustomerUI)
			{
				((CustomerUI) ui).showOptions();
				if(!((CustomerUI) ui).completeAction(((CustomerUI) ui).inputChecker(userInput.nextLine())))
				{
					finished = true;
				}
				
			}
			else if(ui instanceof AdminUI)
			{
				//((AdminUI) ui).runThroughEquivalent();
			}
			else
			{
				//((GUI) ui).runthroughEquivalent();
			}
			if(finished)
			{
				start(controller, basket, userInput);
			}
			
		}
	}
	public UI chooseUI(int choice, Basket basket, Scanner scanner)
	{
		UI ui = new GUI(basket);
		int input = choice;
		switch(input)
		{
			case 1:
			ui = new AdminUI(scanner);
			return ui;
			case 2:
			ui = new CustomerUI(scanner, basket);
			return ui;
			case 3:
			ui = new GUI(basket);
			return ui;
			case 4:
			System.exit(0);
		}
		return ui;
	}
	//shows all the options available to the user; prints strings from options array
	public void showOptions(String[] options)
	{
		for(String option: options)
		{
			System.out.println(option);
		}
	}
	//evaluates input from the scanner and returns int that represents that
	public int evaluateMenuInput(String userInput)
	{
			switch(userInput)
			{
				case "Admin":
					return 1;
				case "Customer":
					return 2;
				case "GUI":
					return 3;
				case "Exit":
					return 4;
			}
			System.out.println("enter a viable option");
			return 5;
		
	}
}
