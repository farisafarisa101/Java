import java.util.ArrayList;
import java.util.Iterator;
//Q1. Make a User Define Class with data members username, age, address

class UserDetail{
	private String username;
	private int age;
	private String address;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public UserDetail(String username, int age, String address) {
		super();
		this.username = username;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserDetail [username=" + username + ", age=" + age + ", address=" + address + "]";
	}
	public static void add(UserDetail ankita) {
		// TODO Auto-generated method stub
		
	}
	
}
public class User {
	
	

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		ArrayList<UserDetail> userList = new ArrayList<>();

		/*
		 * userList.add(new UserDetail("Ankita",1, "Malkapur")); userList.add(new
		 * UserDetail("Nikita",2, "Buldhana")); userList.add(new UserDetail("Shweta",3,
		 * "Motala")); userList.add(new UserDetail("Farisa",4, "Amravati"));
		 * 
		 */	
		//	-> create some objects and add inside arrayList
		UserDetail ankita = new UserDetail("Ankita",1, "Malkapur");
		UserDetail nikita = new UserDetail("Nikita",2, "Buldhana");
		UserDetail shweta = new UserDetail("Shweta",3, "Motala");
		UserDetail farisa = new UserDetail("Farisa",4, "Amravati");
//		Adding User in ArrayList(userList)
		UserDetail.add(ankita);
		UserDetail.add(nikita);
		UserDetail.add(shweta);
		UserDetail.add(farisa);


		//-> Traverse all Objects with the help of Iterator Inteface

		
		Iterator<UserDetail> itr =  userList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//	-> Remove position 2 Object from ArrayList

		userList.remove(1);
		System.out.println("After removal: " +userList);
		
		//	-> perform a searching operation with username

		System.out.println("----Search an element---------------");
		if(userList.contains("Nikita")) {
			System.out.println("Found : " +userList);
		}
		else {
			System.out.println("Color not Found : " +userList);
		}
		//	-> Add another List of Objects inside ArrayList

		ArrayList<UserDetail> userP=new ArrayList<>();//Object creation
		userP.add(new UserDetail("Sunita",5, "Malkapur"));
		userP.add(new UserDetail("Abram",6, "Nandura"));
		userList.addAll(userP);
		
		System.out.println("After Adding : " +userP);





	}

}
