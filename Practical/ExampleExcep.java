package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleExcep {
	public static void Excp() {
		try {
		try {
			@SuppressWarnings("resource")
			Scanner Sc=new Scanner(System.in);      
			System.out.println("Enter value of x : ");
			int x=Sc.nextInt();
			System.out.println("Enter value of y : ");
			int y=Sc.nextInt();
			System.out.println("The result is " +(x/y));
		}catch(Exception e) {
			System.out.println(e);
		}
	}catch(InputMismatchException f) {
		System.out.println("java.util.InputMismatchException\r\n");
	}
	}
	public static void main(String args[]) {
		Excp();
		
	}

}

