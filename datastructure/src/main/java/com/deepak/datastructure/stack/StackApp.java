package com.deepak.datastructure.stack;

/**
 * Hello world!
 *
 */
public class StackApp 
{
    public static void main( String[] args )
    {
    	
    	Stack mystack = new Stack();
    	
    	System.out.println("is empty"+mystack.isEmpty());
    	System.out.println("is full"+mystack.isFull());
    	System.out.println("top="+mystack.getTop());
    	
    	for (int i = 0; i < mystack.getSize(); i++) {
			
    		mystack.push(i+10);
			
		}
    	System.out.println("is empty"+mystack.isEmpty());
    	System.out.println("is full"+mystack.isFull());
    	System.out.println("top="+mystack.getTop());
    	
    	for (int i = 0; i < mystack.getSize(); i++) {
			
    		try {
				System.out.println(mystack.pop());
			} catch (IndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
    	try {
			mystack.pop();
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("is empty"+mystack.isEmpty());
    	System.out.println("is full"+mystack.isFull());
    	System.out.println("top="+mystack.getTop());
    	
     }
}
