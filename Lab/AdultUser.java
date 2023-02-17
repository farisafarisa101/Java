package Lab3;

public class AdultUser implements LibraryUser {//Implementing the LibraryUser Interface
	int age;
	String bookType;
	
	public AdultUser(int age, String bookType) {//Constructor for AdulUser
		super();
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if (this.age>12) {//if age is greater than 12 this sentence will get displayed 
			System.out.println("You have successfully registered under an Adult Account");
		}
		else{//otherwise this sentence will get displayed
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}

		
	}

	@Override
	public void requestBook() {
		if (this.bookType.equals("Fiction")) {//if book type is fiction then this will get displayed
			System.out.println("Book Issued successfully, please return the book within 7 days");
			
		}
		else {//otherwise this sentence will get displayed
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}

		
	}

}
