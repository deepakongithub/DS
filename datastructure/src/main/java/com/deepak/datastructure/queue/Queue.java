package com.deepak.datastructure.queue;

public class Queue<K> {
	
	
	
	private K[] queue;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	
	
	
	
	@SuppressWarnings("unchecked")
	public Queue() {
		this.size=100;
		this.queue  =  (K[]) new Object[this.size];

	}

	@SuppressWarnings("unchecked")
	public Queue(int size) {
		this.size = size;
		this.queue  =  (K[]) new Object[this.size];

	}
	
	
	public boolean enQueue(K item) {
		if(!isFull()) {
			this.queue[rear]= item;
			rear= rear+1%size;
			total++;
			return true;
		}else {
			return false;
		}
		
	}

	public K deQueue() {
		K item = queue[front];
		total--;
		front = front+1%size;;
		
		return item;
	}
	
	public boolean isFull() {
		
		if(total==size) {
			return true;
			
		}else {
			return false;
		}
		
	}
	
	
	
	
	public K[] getQueue() {
		return queue;
	}
	public int getSize() {
		return size;
	}
	public int getTotal() {
		return total;
	}
	public int getFront() {
		return front;
	}
	public int getRear() {
		return rear;
	}
	
	
	
	
	
	

}
