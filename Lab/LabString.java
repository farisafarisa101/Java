package lab6;

public class LabString {//class Declaration 

	public static void probState1() {//static method declaration for Problem Statement 1
		System.out.println("-------------Problem Statement 1------------------");
		@SuppressWarnings("unused")
		String str="Welcome to Java World";//String Declaration using literal
		System.out.println("1 " +str.charAt(5));//it will Returns the character at 5th position and displayed it 
		System.out.println("2 "+str.compareToIgnoreCase("Welcome"));//Return positive Number i.e it is equal it will compares the String with “Welcome” lexicographically by ignoring case differences and display the result.
		System.out.println("3 "+str.concat("- Let us learn"));// this will Concatenates “- Let us learn” to the above String
		System.out.println("4 "+str.indexOf("a"));// This will Returns the position of the first occurrence of character ‘a’.
		System.out.println("5 "+str.replace('a', 'e'));//this will Replaces all the occurrences of ‘a’ character with the new ‘e’ .
		System.out.println("6 "+str.substring(4, 10));// This will Returns string between 4th position and 10th position
		System.out.println("7 "+str.toLowerCase());//This will Returns the lowercase of the string 
		
	}
	@SuppressWarnings("unused")
	public static void probState2() {//static method declaration for Problem Statement 2
		System.out.println("-------------Problem Statement 2------------------");
		StringBuffer str1=new StringBuffer("This is StringBuffer ");//String declaration with object of StringBuffer class
		System.out.println(str1+"This is a sample program");//This will Adds the string ”- This is a sample program” to our existing string
		System.out.println(str1.insert(21, "Object"));// this will Inserts the string “Object” into the existing string at 21st position
		System.out.println(str1.reverse());//Reverses the entire string and displays it.
		System.out.println(str1.reverse());//double reverse to get the original String in order to perform next function
		System.out.println(str1.replace(14, 20, "Builder"));//this will Replaces the word “Buffer” with “Builder”
	}
	public static void main(String[] args) {
		probState1();//calling static method 1
		probState2();//calling static method 2
		/*Outputs 
		 * -------------Problem Statement 1------------------
		1 m
		2 14 
		3 Welcome to Java World- Let us learn
		4 12
		5 Welcome to Jeve World
		6 ome to
		7 welcome to java world
		-------------Problem Statement 2------------------
		This is StringBuffer This is a sample program
		This is StringBuffer Object
		tcejbO reffuBgnirtS si sihT
		This is StringBuffer Object
		This is StringBuilder Object

		 * 
		 */

	}

}
