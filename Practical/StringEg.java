package string;

public class StringEg {

	public static void main(String[] args) {
		//Methods of Comparison equals(),==,ComapreTo()
		String a1="Anudip";
		String a3="anudip";
		String a2="Anudip Foundation Vashi";
		String a4="Anudip";
		System.out.println(a1.equals(a2));//equals () compares values of string 
		System.out.println(a1.equals(a3));//false case mismatch
		System.out.println(a1.equalsIgnoreCase(a3));//true
		System.out.println(a1==a2);//==compares references not value//will return false
		System.out.println(a1==a4);//true
		//compareTo ()
		//lexicographically
		String a5="apple";
		String a6="america";
		System.out.println(a6.compareTo(a5));//negative
		System.out.println(a1.compareTo(a4));//equal
		System.out.println(a2.compareTo(a1));//positive 
		
		//Concatenation + and concat()
		
		System.out.println("-----------------Concat ----------------");
		System.out.println(a5+ " " +a6);
		
		
		System.out.println(60+7+" my "+90+7.4);//before string its + and after string connect
		System.out.println(a5.concat(a6));
		
		// Substring
		System.out.println("-----------------Substring-----------------------");
		System.out.println(a2.substring(7));
		System.out.println(a2.substring(0, 6));
		System.out.println(a2.substring(6));
		System.out.println(a2.substring(17));
			
	}
	
}
