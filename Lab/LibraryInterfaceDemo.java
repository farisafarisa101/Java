package Lab3;
public class LibraryInterfaceDemo {

	public static void main(String[] args) {//Main method Declaration
		KidUsers k1=new KidUsers(10,"Kids"); //object creation 
		k1.registerAccount();//calling registeAccoutn() using k1 object
		k1.requestBook();
		KidUsers k2=new KidUsers(18,"Fiction");
		k2.registerAccount();//calling registeAccoutn() using k2 object
		k2.requestBook();
		AdultUser a1=new AdultUser(5,"Kids");
		a1.registerAccount();//calling registeAccoutn() using a1 object
		a1.requestBook();
		AdultUser a2=new AdultUser(23,"Fiction");
		a2.registerAccount();//calling registeAccoutn() using a2 object
		a2.requestBook();		

	}

}
