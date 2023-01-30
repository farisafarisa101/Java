import java.util.Scanner;
class ConditionalStatement1 {
	public void singleIfElse(int y) {
		
		if(y==80)
		{
			System.out.print("yes y is equal to 200");
		}
		else
		{
			System.out.print("y is not equal to 200");
		}
	}
	public void Nested_If(int x) {
		if(x%2==0)
		{
			System.out.println("x is an even number");
			if(x==2)
			{
				System.out.println("x is equal to 2");
			}
			else {
				System.out.println("x is not equal to 2");	
			}
			
		}
		else {
			System.out.println("x is an odd number");
		}
	}
	public void Else_if(int age)
	{
		
		
		if(age<18)
		{
			System.out.print("not adult");
		}
		else if(age>=18 &&  age<=59)
		{
			System.out.print("adult");
		}
		else {
			System.out.print("senior citizen");
		}
	}

	public static void main(String[] args) {
		ConditionalStatement1 obj=new ConditionalStatement1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of y:");
		int y=sc.nextInt();
		obj.singleIfElse(y);
		System.out.println("\n Enter the value of x:");
		int x=sc.nextInt();		
		obj.Nested_If(x);
		System.out.println("\n Please Enter your age:");
		int age=sc.nextInt();	
		obj.Else_if(age);
		

	}

}