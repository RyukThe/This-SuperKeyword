package static1;

public class Sample7 
{
public static void main(String[]args)
{
	////1.static method from same class
	m1();  ////methodname();
	
	/////2.static method from diff class
	Sample8.m2();  ////diffclassname.diffmethodname();
	
	/////3.non-static method from same class
	Sample7 rushi=new Sample7();  /////1.create object of same class
	rushi.m3();    /////2.method call------>objectname.methodname();
	
	////4.non static method from diff class
	Sample8 rushikesh=new Sample8(); //////diffclassname objectname=new diffclassname();
	rushikesh.m4();   ///////objectname.diffmethodname();	
}
 public static void m1()
 {
  System.out.println("running m1 from same class");
 }
 public void m3()
 {
	 System.out.println("running m3 from same class");
 }
}
