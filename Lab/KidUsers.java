package Lab3;

public class KidUsers implements LibraryUser{//Implementing the LibraryUser Interface
	int age;//Instance variable Declaration
	String bookType;
	

	public KidUsers(int age, String bookType) {//Constructor for the KidUsers
		super();
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {//Override Method For registerAccount 
		if (this.age<=12) {//Checking teh value of age less than or equal to 12 if true 
			System.out.println("You have successfully registered under a Kids Account");
		}
		else{ //Otherwise Below sentnce will get displayed
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}

	@Override
	public void requestBook() {//override Method for requestBook()
		if (this.bookType.equals("Kids")) {//if bookType is Equal to kids below will get displayed
			System.out.println("Book Issued successfully, please return the book within 10 days");
			
		}
		else {//otherwise this sentence will get displayed
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}

}
