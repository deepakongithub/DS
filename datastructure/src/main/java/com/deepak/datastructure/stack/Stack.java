package com.deepak.datastructure.stack;

public class Stack<K> {

	
	private K[] stack;
	private int top;
	private int size;
	
	
	
	@SuppressWarnings("unchecked")
	public Stack() {
		super();
		this.top=-1;
		this.size = 50;
		this.stack = (K[]) new Object[this.size];
		
	}
	
	@SuppressWarnings("unchecked")
	public Stack(int size) {
		super();
		this.top=-1;
		this.size = size;
		this.stack =  (K[]) new Object[this.size];
		
	}

	
	public boolean push(K item) {
		if(!isFull()) {
			this.top++;
			this.stack[this.top]=item;
			return true;
		}
		
		return false;
	}
	
	public K pop() throws IndexOutOfBoundsException , Exception{
		
		return this.stack[this.top--];
	}
	
	
	public boolean isEmpty() {
		
		return (this.top==-1);

	}

	public boolean isFull() {
		
		return (this.top==this.stack.length-1);

	}

	public K[] getStack() {
		return stack;
	}


	public int getTop() {
		return top;
	}


	public int getSize() {
		return size;
	}

	
	
	
	
	
 }
