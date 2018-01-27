package Basket;

public abstract class Item {
	
	private String name;
	private double price;
	private int code;
	private Date date;
	
	public Item(String name, double price, int code, Date date)
	{
		this.code = code;
		this.name= name;
		this.price = price;
		this.date = date;
		
	}
	
	//getter methods
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getCode()
	{
		return code;
	}
	
	public Date getDate()
	{
		return date;
	}
	
	//setter methods
	
	public void setName(String name)
	{
		this.name= name;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
		
	}
	
	public void setCode(int code)
	{
		this.code = code;
		
	}
	
	public void setDate(Date date)
	{
		this.date = date;
	}
}
