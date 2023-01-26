package arraylistdatastructureprogram;

import java.util.ArrayList;

public class Program1 {
public static void main(String[] args) {
	ArrayList all = new ArrayList();
	all.add(10);
	all.add(20);
	all.add(30);
	all.add(40);
	all.add(50);
	all.add(1,99);
	System.out.println("all ------> " + all);
	ArrayList all1 = new ArrayList();
	all1.add(11);
	all1.add(22);
	all1.add(33);
	all1.add(44);
	all1.add(55);
	all1.addAll(all);
	System.out.println("all1 ----------> " + all1); 
	
	ArrayList all2 =  new ArrayList();
	all2.add(111);
	all2.add(222);
	all2.add(333);
	all2.add(444);
	all2.add(555);
	all2.addAll(all1);
	System.out.println("all2 --------->" + all2);
	System.out.println(all.contains(99));
	System.out.println(all2.clone());
	System.out.println(all2);
}
}
