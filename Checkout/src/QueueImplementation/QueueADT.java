package QueueImplementation;

public interface QueueADT<T> {
	
	//add an item to the queue
	public abstract void enqueue(T item);
	
	//take an Item away from the queue and return it
	public abstract T dequeue();
	
	//returns the item at the front of the queue
	public abstract T first();
	
	//return true if the queue is empty
	public abstract boolean isEmpty();

}
