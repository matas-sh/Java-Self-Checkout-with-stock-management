package Basket;

public class Beverages extends Item {
	private double capacity;
	
	Beverages(String name, double price, int code, Date expiryDate, int capacity)
	{
		super(name, price, code, expiryDate);
		this.capacity = capacity;
	}
	//getter methods
		public double getCapacity()
		{
			return capacity;
		}
		public void setWeight(double capacity)
		{
			this.capacity = capacity;
		}
}
