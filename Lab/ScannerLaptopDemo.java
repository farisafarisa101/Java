package lab5;

import java.util.Scanner;//in order to use scanner we have import the scanner class 

public class ScannerLaptopDemo {//declare the class name  as SannerLaptopDemo
	static int choice;//Static integer variable choice for selection of options 
	public static void main(String[] args) {//Main method
	    int number1, number2, result;//variable declaration for the different operation

	    // create an object of Scanner class
	    @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);//Scanner to take input from the user in the form of numbers
	    do {
	    

	    // ask users to enter which operation he/she wanted to perform 
		System.out.println("Add-1\r\n"
				+ "\r\n"
				+ "Subtract-2\r\n"
				+ "\r\n"
				+ "Multiply-3\r\n"
				+ "\r\n"
				+ "Even/OddNumber -4\r\n"
				+ "\r\n"
				+ "Quit-5\r\n"
				+ "\r\n");
	    choice = input.nextInt();// ask users to enter 

	    
	    
	    switch (choice) {//here choices to select from multiple opration
			case 1://addition 
			    System.out.println("Enter first number");//user will enter first number
			    number1 = input.nextInt();//number will be store here

			    System.out.println("Enter second number");//user will enter second number
			    number2 = input.nextInt();//number will be store here

		        result = number1 + number2;//addition will be perform here and final value will be store in result
		        System.out.println(number1 + " + " + number2 + " = " + result);//result will get displayed
				break;
			case 2:
			    System.out.println("Enter first number");//user will enter first number
			    number1 = input.nextInt();//number will be store here

			    System.out.println("Enter second number");//user will enter second number
			    number2 = input.nextInt();//number will be store here

		        result = number1 - number2;//Subtraction will be perform here and final value will be store in result
		        System.out.println(number1 + " - " + number2 + " = " + result);//result will get displayed
				break;
			case 3:
			    System.out.println("Enter first number : ");//user will enter first number
			    number1 = input.nextInt();//number will be store here

			    System.out.println("Enter second number :");//user will enter second number
			    number2 = input.nextInt();//number will be store here

		        result = number1 * number2;//Multiplication will be perform here and final value will be store in result
		        System.out.println(number1 + " * " + number2 + " = " + result);//result will get displayed
				break;
				
			case 4:
			    System.out.println("Enter the number");//user will enter first number
			    number1 = input.nextInt();//number will be store here
			    if (number1%2==0) {//if the remainder of the value is equal to 0 
			    	System.out.println( " The number is Even ! ");//then the number is Even 
			    	}
			    else {//Otherwise Odd
				System.out.println( " The number is Odd ! ");
				}
				break;
			case 5://You wil get of the switch when you select this option as quit
				System.out.println("You have Selected Quit....Thank You");
				break;

			default:
		        System.out.println("Invalid Option!");
			break;
			}
	
	    System.out.println("----------------------------------------");

		}while(choice!=5);//to check the condition if it is equal to 5 then you will get out of the 
		
	}
	
}


 