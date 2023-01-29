package treesetdatastructure;

import java.util.TreeSet;

public class Program1 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		ts.add(1);
		System.out.println(ts);
		System.out.println(ts.ceiling(75));
		System.out.println("--------------");

		System.out.println(ts.higher(75));
		System.out.println("--------------");

		System.out.println(ts.floor(75));
		System.out.println("--------------");

		System.out.println(ts.lower(75));
		System.out.println("--------------");
		System.out.println(ts.ceiling(100));
		System.out.println("--------------");

		System.out.println(ts.higher(100));
		System.out.println("--------------");

		System.out.println(ts.floor(100));
		System.out.println("--------------");

		System.out.println(ts.lower(100));
		System.out.println("--------------");

		System.out.println(ts.tailSet(100));
		System.out.println("--------------");

		System.out.println(ts.headSet(100));
		System.out.println("--------------");
	}
}
