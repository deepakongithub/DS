package com.deepak.datastructure.stack;

public class Stack {

	
	private int[] stack;
	private int top;
	private int size;
	
	
	
	public Stack() {
		super();
		this.top=-1;
		this.size = 50;
		this.stack = new int[this.size];
		
	}
	
	public Stack(int size) {
		super();
		this.top=-1;
		this.size = size;
		this.stack = new int[this.size];
		
	}

	
	public boolean push(int item) {
		if(!isFull()) {
			this.top++;
			this.stack[this.top]=item;
			return true;
		}
		
		return false;
	}
	
	public int pop() throws IndexOutOfBoundsException , Exception{
		
		return this.stack[this.top--];
	}
	
	
	public boolean isEmpty() {
		
		return (this.top==-1);

	}

	public boolean isFull() {
		
		return (this.top==this.stack.length-1);

	}

	public int[] getStack() {
		return stack;
	}


	public int getTop() {
		return top;
	}


	public int getSize() {
		return size;
	}

	
	
	
	
	
 }
