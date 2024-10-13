package Basic;

public class fibbo {
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int cnt=10;
		
		while(cnt-2>0)
		{
		 int c = a + b;    
	         a = b; 
	         b=c;
	         
	         System.out.println(c);
	         cnt--;
		}
	}

}
