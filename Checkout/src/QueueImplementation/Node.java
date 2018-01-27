package QueueImplementation;

import Basket.Item;

public class Node {
	Node behind = null;
	Node infront = null;
	Item contained = null;
	public Node(Item e)
	{
		contained = e;
	}
	public void setInfront(Node e)
	{
		infront = e;
	}
	public void setBehind(Node e)
	{
		behind = e;
	}
	public Node getInfront()
	{
		return infront;
	}
	public Node getBehind()
	{
		return behind;
	}
	public Item getItem()
	{
		return contained;
	}
	
}
