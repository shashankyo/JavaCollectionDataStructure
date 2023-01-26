package arraylistmethods;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) 
	{
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.add(2, 99);
		System.out.println("al1 -------> "+al1);
		ArrayList al2 = new ArrayList();
		al2.add(11);
		al2.add(22);
		al2.add(33);
		al2.add(44);
		al2.add(55);
		al2.addAll(al1);
		System.out.println("al2 -------> "+al2);
		ArrayList al3 = new ArrayList();
		al3.add(111);
		al3.add(222);
		al3.add(333);
		al3.add(444);
		al3.add(555);
		al3.addAll(3, al2);
		System.out.println("al3 -------> "+al3);
		
		System.out.println(al1.contains(99));
		System.out.println(al2.containsAll(al1));
		al3.clear();
		System.out.println(al3);	
	}
}
