package This_superkey_word;

public class Sample4 extends Sample3
{
	///int m=23;    //global variable from super class
	
	int m=34;       //global variable from same class
	public void m1()
	{
		int m=76;          ///local variable
		System.out.println(m);        //76
		System.out.println(this.m);   //(this.34) ---->when you call global variable for same class
		System.out.println(super.m);  //(super.23) ----->when you call global variable for super class
		
		
	}
	public static void main(String[]args)
	{
		Sample4 s4=new Sample4();
		s4.m1();
	}
}
