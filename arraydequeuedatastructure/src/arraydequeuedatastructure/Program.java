package arraydequeuedatastructure;

import java.util.ArrayDeque;

public class Program {
public static void main(String[] args) {
	ArrayDeque ad = new ArrayDeque();
	ad.add(10);
	ad.add(20);
	ad.add(30);
	ad.add(40);
//	ad.add(2,50);error
	ad.addFirst(50);
	ad.addLast(60);
	System.out.println(ad);
}
}