package Basket;

public class NonParishable extends Item {
	private double weight;
	
	NonParishable(String name, double price, int code, Date useBy, double weight)
	{
		super(name, price, code, useBy);
		this.weight = weight;
	}
	
	//getter methods
	public double getWeight()
	{
		return weight;
	}
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	
}
