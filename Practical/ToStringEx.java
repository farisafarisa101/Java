package string;
class My{
	int num;
	String name;
	public My(int num,String name) {
		super();
		this.name=name;
		this.num=num;
	}
	@Override
	public String toString() {
		return "num=" + num + ", name=" + name;
	}

}
public class ToStringEx {

	public static void main(String[] args) {
		My n1=new My(12,"mango");
		My n2=new My(12,"Watermelon");
		System.out.println(n1);//n1.toString()
		System.out.println(n2);//n2.toString()

		
		
	}

}
