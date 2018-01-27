package Basket;

public class Date {
	int d, m, y;
	Date(int d, int m, int y)
	{
		this.d = d;
		this.m = m;
		this.y = y;
	}
	public String getDate()
	{
		return (""+d+" "+m+" "+y);
	}
	public void setDate(int d, int m, int y)
	{
		this.d = d;
		this.m = m;
		this.y = y;
	}
}
