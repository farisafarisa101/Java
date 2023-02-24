package string;

public class StringMethodEx {

	public static void main(String[] args) {
		
		String a="Anudip foundation";
		System.out.println(a.toUpperCase());//ANUDIP FOUNDATION
		System.out.println(a.toLowerCase());//anudip foundation
		System.out.println(a.startsWith("Anu"));//true
		System.out.println(a.endsWith("tion"));//true
		System.out.println(a.charAt(7));//f
		System.out.println(a.length());//17
		System.out.println(a);//Anudip foundation
		System.out.println(a.replace("Anudip", "Anudeep"));//Anudeep foundation
		
		int num=55;
		String b=String.valueOf(num);//"55"
		System.out.println(b+55);//5555
		
	
	}

}
