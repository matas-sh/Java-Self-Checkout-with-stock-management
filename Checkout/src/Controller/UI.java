package Controller;

import java.util.Scanner;

import Basket.Basket;

public abstract class UI {
	Basket basket = null;
	Scanner scanner = null;
	
	public UI(Scanner scanner, Basket basket)
	{
		scanner = this.scanner;
		basket = this.basket;
	}
	public UI(Basket basket)
	{
		basket = this.basket;
	}
	public UI(Scanner scanner)
	{
		scanner = this.scanner;
	}
}
