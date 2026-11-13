class A{
	static final int x=10;
	A(){
		//this.x=10;
		//x=20;
	}
	final void getx(){
		final int x=10;
		System.out.println("Ax:"+this.x);
	}
}