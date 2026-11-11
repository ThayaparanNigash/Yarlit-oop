package MyStudent;
public class Student{
	int id;
	String name;
	
	Student(int id){
		this.id=id;
	}
	public Student(String name, int id){
		this(id);
		this.name=name;
	}	
	
	public void getStudent(){
		System.out.println("ID"+this.id);
		System.out.println("NAME"+this.name);
	}
	
}