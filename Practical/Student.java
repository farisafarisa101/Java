
public class Student {
	private int roll_num;
	private String name;
	private String course;
	public int getRoll_num() {
		return roll_num;
	}
	public void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student(int roll_num, String name, String course) {
		super();
		this.roll_num = roll_num;
		this.name = name;
		this.course = course;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [roll_num=" + roll_num + ", name=" + name + ", course=" + course + "]";
	}

	
	
	
}

