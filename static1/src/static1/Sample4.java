package static1;  /////packagename

public class Sample4 /////classname
{
	////3.non static method call from same class
public static void main(String[] args)   //////main method
{
///classname objectname = new classname(); -------->syntax of object creation
Sample4 rushi = new Sample4();   //////step1.create object of same class
rushi.m1(); /////2.method call--------->  objectname.methodname();
rushi.m2();
///1.Sample4---->Classname----->datatype
///2.rushi----->objectname------>to identify/refer object
///3.new------>keyword---->to create blank/empty object
///4.Sample4()----->methodname()------>constructor call----->to copy all the members of class into object.

}
	public void m1() //////non static method
	{	
	System.out.println("Saurav kasture");  ////print statement
	}
	public void m2()
	{
    System.out.println("Hellow ");
	}
}
