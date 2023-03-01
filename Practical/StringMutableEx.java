package string;

public class StringMutableEx {
	//StringBuilder & StringBuffer 
	//append(),insert(),replace(),delete(),reverse(),charAt(),length(),subString()
	//toString(): String Tokenizer class
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Anudip Foundation");
		System.out.println(s1.append(" Vashi "));//print Anudip Foundation Vashi 
		System.out.println(s1);
		System.out.println(s1.insert(0,"NGO - "));
		StringBuilder s2=new StringBuilder("Java Professional");
		System.out.println(s2.replace(5, 8, "Java"));
		System.out.println(s2.delete(5, 9));
		System.out.println(s2.reverse());
		System.out.println(s2.charAt(0));
		System.out.println(s2.reverse());
		System.out.println(s2.length());
		System.out.println(s2.substring(3));
	//toString()
		System.out.println(s2.toString());
		
		
		
		
	}

}
