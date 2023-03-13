import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAssingment {

	public static void main(String[] args) {
		//1. Write a Java program to create a new array list, add some colors (string) and print out the collection. 
		ArrayList<String> Collection=new ArrayList<>();//Object creation
		//Adding Some Color names
		Collection.add("Red");
		Collection.add("Blue");
		Collection.add("Green");
		Collection.add("Pink");
		Collection.add("White");
		System.out.println("------------Printing the Collection----------------");
		System.out.println(Collection);//Printing the collection
		//2. Write a Java program to iterate through all elements in a array list. 
		//Iterating through all elements in a array list
		System.out.println("-----------Iterating through all elements in a array list----------------");
		Iterator<String> itr=Collection.iterator();
		while(itr.hasNext()) {
		System.out.print(" "+itr.next());
		}
		//3. Write a Java program to insert an element into the array list at the first position.
		//insert element at 1 position
		Collection.add(1, "Gray");
		System.out.println("------------------------------------------");
		System.out.println("After Inserting " +Collection);
		//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
		System.out.println("-------------Retrive from the specified location");
		System.out.println(Collection.get(7));
		//5. Write a Java program to remove the third element from a array list. 
		System.out.println("----------Remove the third element from the list------------------");
		System.out.println(Collection.remove(3));
		//6. Write a Java program to search an element in a array list.
		System.out.println("----Search an element---------------");
		if(Collection.contains("Blue")) {
			System.out.println(Collection.remove("Blue"));
			System.out.println(Collection);
		}
		else {
			System.out.println("Color not Found"+Collection);
		}
		//7.Write a Java program to copy one array list into another. 
		System.out.println("---------Copy one list to another list------------");
		ArrayList<String> CollectionP=new ArrayList<>();//Object creation
		CollectionP.add("Brown");
		CollectionP.add("Black");
		Collection.addAll(CollectionP);
		///8. Write a Java program to compare two array lists.
		System.out.println("-------Compare the two array------------------");
		System.out.println(Collection.equals(CollectionP));




		



		



	}

}
