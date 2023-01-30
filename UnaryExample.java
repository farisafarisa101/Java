class UnaryExample{
public void calcDecrement(){
	int x=10;
	System.out.println(x--);print 10 9
	System.out.println(x--);9 8
	System.out.println(--x);
	System.out.println(--x);
	System.out.println(x--);
	System.out.println(x);
}
public void calcIncrement(){
	int x=10;
	System.out.println(x++);
	System.out.println(x++);
	System.out.println(++x);
	System.out.println(x++);
	System.out.println(x);
}

	public static void main(String args[]){
	UnaryExample my=new UnaryExample();
my.calcDecrement();
my.calcIncrement();
}
}