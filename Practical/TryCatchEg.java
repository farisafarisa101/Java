package exception;

public class TryCatchEg {

	public static void main(String[] args) {
		try {//may throw Exception
			//int numb=88/0;
			//System.out.println(numb);
			//String name=null;
			//System.out.println(name.length());
			String m="java";
			int i=Integer.parseInt(m);
			System.out.println(i);		
		}
		catch(Exception e){//Handle Exception
			System.out.println(e);
			//System.out.println(e + " Can not divide by zero");
		}

	}

}
