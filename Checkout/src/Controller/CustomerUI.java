package Controller;
import java.util.Scanner;

public class CustomerUI {
	private boolean IsEmpty, transactionCompeleted = false;
	private static String[] options ={"Start", "Add", "Delete", "Checkout", "Exit"}; 
	public CustomerUI()
	{
		
	}
	public static void main(String[] args)
	{
		CustomerUI ui = new CustomerUI();
		boolean finish = false;
		while(!finish)
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Welcome, What would you like to do?");
			ui.showOptions();
			ui.inputChecker(userInput.nextLine());
			
		}
	}
	public int inputChecker(String comparable)
	{
		switch(comparable)
		{
		case "Start":
			return 1;
		case "Add":
			return 2;
		case "Delete":
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
