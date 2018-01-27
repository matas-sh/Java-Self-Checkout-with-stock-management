package QueueImplementation;

import Basket.Item;

public class ItemQueue implements QueueADT<Item> {
	private Node front;
	private Node back;
	private int size = 0;

	
	public void enqueue(Item item) {
		
		Node newNode = new Node(item);
		if(!isEmpty())
		{
			newNode.setInfront(back);
			back.setBehind(newNode);
			back= newNode;
		}
		back =newNode;
		front =newNode;
		size++;
	}
	public Item dequeue() {
		if(!isEmpty())
		{
			Item temp = front.getItem();
			front = front.getBehind();
			size--;
			return temp;
		}
		return null;
	}

	public Item first() {
		return front.getItem();
	}

	public boolean isEmpty() {
		if(size != 0)
		{
			return false;
		}
		else 
		{ 
			return true;
		}
	}
}
	
	