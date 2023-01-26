package arraylinkedlistpeekpoll;

import java.util.LinkedList;

public class Program {
public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	ll.add(1,50);
	ll.addFirst(99);
	ll.addLast(999);
	System.out.println(ll);
	System.out.println("------------------");
	System.out.println(ll.peek());
	System.out.println(ll);
	System.out.println("------------------");
	System.out.println(ll.peekFirst());
	System.out.println(ll);
	System.out.println("------------------");
	System.out.println(ll.peekLast());
	System.out.println(ll);
	System.out.println("------------------");
	System.out.println(ll.poll());
	System.out.println(ll);
	System.out.println("------------------");
	System.out.println(ll.pollLast());
	System.out.println(ll);
	System.out.println("------------------");
	System.out.println(ll.peek());
	System.out.println(ll);
	
	
	LinkedList ll1 = new LinkedList();
	ll1.push(10);
	ll1.push(20);
	ll1.push(30);
	System.out.println(ll1);
	System.out.println(ll1.pop());
}
}
