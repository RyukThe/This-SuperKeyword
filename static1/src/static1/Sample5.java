package static1;   ////packagename

public class Sample5  //////classname
{
	////4.non static method call from diffrent class
	
public static void main(String[] args)    /////main method
{
/////diffclassname objectname=new diffclassname();
	Sample6 rushikesh=new Sample6();    ///1.create object of diff class
	rushikesh.m3();  ///////2.method call---->diffclassObjectname.methodname();
}
	
}
