package linkedlistexamples;

import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {

		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Integer> list=new LinkedList();
		list.add(34);
		list.add(35);
		list.add(14);
		System.out.println(list);
		list.add(0, 10);
		System.out.println(list);
//		List<Integer> oldList =new LinkedList<>();
//		oldList.add(5);
//		oldList.add(11);
//		list.addAll(oldList);
		//Traverse using toString
		System.out.println(list.toString());
		 
		//Using Enhanced Loop
		for (int b:list) {
			System.out.println(b);
		}
		
		//Traverse using forEach
		list.forEach(a->System.out.println(a+ ""));
		System.out.println();
		
		//Using Normal for loop
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//Traversed using Iterator
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
		
		//Traverse using ListIterator
		
		ListIterator<Integer> itr1=list.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		

	}

}
