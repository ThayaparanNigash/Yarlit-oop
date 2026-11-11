class MainA{
	static int x=10;
	public static void main(String args[]){
		MainA mainobja=new MainA();
			System.out.println(mainobja.x);
		 
		/*System.out.print(x);
		myname();*/
		
		
		for(int i=0;i<args.length;i++)
		System.out.println(args[i]);

		/*A obja=new A();
		obja.getx();
		System.out.println("Ax:"+A.x);*/
	}
	 static void myname(){
		System.out.println("My name is:");
	}


}