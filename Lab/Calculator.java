import java.util.Scanner;

class Calculator {
	    public void calc(int operation,int num1 ,int num2){
                     switch (operation) {
                
                case 1:
            // performs addition between numbers
                    
                    System.out.println(num1 + " + " + num2 + " = " +(num1 + num2));
                    break;
                    // performs subtraction between numbers
                case 2:
        
                   System.out.println(num1 + " - " + num2 + " = " +(num1-num2));
                    break;
                    // performs multiplication between numbers
                case 3:
                            System.out.println(num1 + " * " + num2 + " = " +(num1 * num2));
                    break;         
                    // performs division between numbers
                case 4:
        
                    System.out.println(num1 + " / " + num2 + " = " +(num1 / num2));
                    break;
		case 5:
        		//performs moodulo operation
                    System.out.println(num1 + " % " + num2 + " = " +(num1 % num2));
                    break;
        
                default:
                    System.out.println("Invalid Operation");
                    break;
      }
      
    }    
     public static void main(String args[]) {
         
         // create an object of Scanner class
         Scanner input= new Scanner(System.in);
	// ask users to enter numbers
          System.out.println("Enter first number");
          int num1 = input.nextInt();

          System.out.println("Enter second number");
          int num2 = input.nextInt();
          
          // ask users to enter operation
          System.out.println("Write any one Operation : \n 1. Addition \n 2. Subtraction\n 3. Multiplication \n 3.Division \n 4. Modulo  \n ");
          int operation = input.nextInt();
          
          Calculator obj=new Calculator();
          obj.calc(operation,num1,num2);

          
  }
}