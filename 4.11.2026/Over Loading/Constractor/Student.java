class Student{
	int id;
	String name;
	
	Student(){
		this.id=1000;
		this.name="yogan";
	}
	Student(int id){
		this.id=id;
		this.name="murali";
	}
	Student(String name){
		this.id=3000;
		this.name=name;
	}
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	Student(String name,int id){
		this.name=name;
		this.id=id;
	}
	 void getStudent(){
		System.out.println("ID:"+this.id);
		System.out.println("NAME:"+this.name);
		
	}
}