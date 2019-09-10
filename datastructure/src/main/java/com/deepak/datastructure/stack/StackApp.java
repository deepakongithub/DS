package com.deepak.datastructure.stack;

/**
 * Hello world!
 *
 */
public class StackApp 
{
    public static void main( String[] args )
    {
    	
    	Stack<Double> mystack = new Stack<Double>();
    	
    	System.out.println("is empty"+mystack.isEmpty());
    	System.out.println("is full"+mystack.isFull());
    	System.out.println("top="+mystack.getTop());
    	
    	for (int i = 0; i < mystack.getSize(); i++) {
			
    		mystack.push(Math.random());
			
		}
    	System.out.println("is empty"+mystack.isEmpty());
    	System.out.println("is full"+mystack.isFull());
    	System.out.println("top="+mystack.getTop());
    	
    	for (int i = 0; i < mystack.getSize(); i++) {
			
    		try {
				System.out.println(mystack.pop());
			} catch (IndexOutOfBoundsException e) {
 				e.printStackTrace();
			} catch (Exception e) {
 				e.printStackTrace();
			}
			
		}
    	try {
			mystack.pop();
		} catch (IndexOutOfBoundsException e) {
 			e.printStackTrace();
		} catch (Exception e) {
 			e.printStackTrace();
		}
    	System.out.println("is empty"+mystack.isEmpty());
    	System.out.println("is full"+mystack.isFull());
    	System.out.println("top="+mystack.getTop());
    	
     }
}
