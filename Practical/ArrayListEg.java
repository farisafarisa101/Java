import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEg {

	public static void main(String[] args) {
		ArrayList<String> CollectionP=new ArrayList<>();//Object creation
		CollectionP.add("Brown");
		CollectionP.add("Black");


		ArrayList<String> Collection=new ArrayList<>();//Object creation
		//Adding Some Color names
		Collection.add("Red");
		Collection.add("Blue");
		Collection.add("Green");
		Collection.add("Pink");
		Collection.add("White");
		
		Collection.addAll(CollectionP);
		Collection.add(0, "Gray");

		System.out.println(Collection);
		System.out.println(Collection.get(7));
		@SuppressWarnings("unused")
		ListIterator<String> t=Collection.listIterator();
		
		//while(t.hasNext()) {
			//System.out.println("Value is " +t.next());
		//}
		int pos=7;
		String value=Collection.get(pos);
		
		System.out.println(value);
		//System.out.println(Collection.remove(0));
		//System.out.println(Collection);
		
		System.out.println(Collection.isEmpty());

		System.out.println(Collection.contains("Black"));
		if(Collection.contains("Blue")) {
			System.out.println(Collection.remove("Blue"));
			System.out.println(Collection);
		}
		else {
			System.out.println("Color not Found"+Collection);
		}
		//Collection.clear();
		//System.out.println(Collection);
		boolean b=Collection.containsAll(Collection);
		System.out.println(b);
		
		System.out.println(Collection.equals(CollectionP));
		System.out.println(Collection.indexOf("Brown"));
		@SuppressWarnings("unused")
		Iterator<String> itr=Collection.iterator();
		while(itr.hasNext()) {
		System.out.print(" "+itr.next());
		}
	
	}

}
