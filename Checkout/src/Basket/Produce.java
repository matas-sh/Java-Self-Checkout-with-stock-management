package Basket;

public class Produce extends Item {
	private double weight;

	Produce(String name, double price, int code, Date expiryDate, int weight)
	{
		super(name, price, code, expiryDate);
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
