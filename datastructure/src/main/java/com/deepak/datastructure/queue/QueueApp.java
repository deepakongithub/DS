package com.deepak.datastructure.queue;

public class QueueApp {

	public static void main(String[] args) {
 
		
		Queue<Integer> queue = new Queue<Integer>();
		
		System.out.println(queue.getFront());
		System.out.println(queue.getRear());
		System.out.println(queue.getSize());
		System.out.println(queue.getTotal());
		
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		System.out.println("--------------------------");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
		System.out.println("--------------------------");
		System.out.println(queue.getFront());
		System.out.println(queue.getRear());
		System.out.println(queue.getSize());
		System.out.println(queue.getTotal());
		
		
		
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		
		
		System.out.println(queue.getFront());
		System.out.println(queue.getRear());
		System.out.println(queue.getSize());
		System.out.println(queue.getTotal());
	}

}
