import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListex {

	public static void main(String[] args) {
			
//			objects of student class (parametersed constructor)
			Student ram = new Student(1, "ram", "Advance Java");
			Student ajay = new Student(2, "Ajay", "AWS");
			Student raju = new Student(3, "Raju", "Excel");
			
//			objects of student class (Setter method)
			Student abhi = new Student();
			abhi.setRoll_num(4);
			abhi.setName("Abhi");
			abhi.setCourse("Basic Computer");
			
//			Creating ArrayList for Storing Student Class Objects
			ArrayList<Student> studentList = new ArrayList<>();
			
//			Adding Student in ArrayList(studentList)
			studentList.add(ram);
			studentList.add(ajay);
			studentList.add(raju);
			studentList.add(abhi);
			
			studentList.add(new Student(5, "rajan", "Digital Markeeting"));
			
			
			studentList.remove(0);
			Iterator<Student> itr =  studentList.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}

	}
