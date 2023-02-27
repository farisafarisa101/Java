package string;

import java.util.Scanner;

public class StringExample {
	public static void StringEx() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String A :");//Taking First word from the User
		String A=sc.next();
		System.out.println("Enter String B :");//Asking User to enter Second String
		String B=sc.next();
		System.out.println(A+" "+B);//Dispalying both the string 
		int sumLenght=A.length()+B.length();//Calculating sum of length of both string
		System.out.println("Sum of Length of Both String is : " +sumLenght);//displaying length
		if(A.compareTo(B)<0) {
			System.out.println(" Yes "+A+ " comes before "+B);
		}
		else {
			System.out.println(" No "+A+ " Not come before "+B);
		}

		System.out.println(" Initial Capital Letter: "+A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
	}
	public static void main(String[] args) {
		StringEx();
	}

}
