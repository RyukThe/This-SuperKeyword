package This_superkey_word;

public class Sample9 extends Sample5
{
	//String Name ="Rushikesh";  // Global variable for super class
	
	String Name="Rushi";   ///global variable for same class
	public void m1()
	{
		String Name="sada saddfxs";   /////local variable 
		System.out.println(Name);        /////Rushikesh Munde
		System.out.println(this.Name);   //////(this.Rushi)----->When you call global variable for same class
		System.out.println(super.Name);  //////(super.Rushieksh)-----> when you call Global variable for super class
	}
	
	public static void main(String[] args)
	{
		Sample9 s6=new Sample9();
		s6.m1();
	}
	
		
}
