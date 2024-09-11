package This_superkey_word;

public class Sample2 extends Sample1
{
		
	
		int a=20;	                    
		public void m1()
		{
			int a=10;                         
			System.out.println(a);          
			System.out.println(this.a);   
		}
		
		public static void main(String[] args) 
		{
			Sample2 s2=new Sample2();
			s2.m1();
		}
}
