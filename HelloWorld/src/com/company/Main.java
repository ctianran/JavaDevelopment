package com.company;


import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World!");

	    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

	    minHeap.offer(4);
	    minHeap.offer(5);
	    minHeap.offer(2);
	    minHeap.offer(3);
	    minHeap.offer(1);

	    while(!minHeap.isEmpty()){
		    System.out.println(minHeap.poll());
	    }
    }
}
