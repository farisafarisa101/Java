class ArithDemo{
	public void calc(){
	int a=10,b=30;
	System.out.println("Addition"+(a+b));
	System.out.println("Subtraction"+(a-b));
	System.out.println("Multiplication"+(a*b));
	System.out.println("Division"+(a/b));
	System.out.println("Modulu"+(a%b));

}
public static void main(String args[]){
ArithDemo obj=new ArithDemo();
obj.calc();
}
}