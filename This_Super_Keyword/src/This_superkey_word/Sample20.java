package This_superkey_word;

public class Sample20 extends Sample7
{
	
	
	float percentage=87.46f;   
	public void m3()
	{
		float percentage=78.98f;    
		System.out.println(percentage);  
		System.out.println(this.percentage);   
		System.out.println(super.percentage);   
		
	}
	public static void main(String[] args) 
	{
		Sample20 s8=new Sample20();
		s8.m3();
	}
	
}
