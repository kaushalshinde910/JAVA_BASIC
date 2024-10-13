package Basic;

public class Harsh1 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number=151;
		   int num=number;
		   int sum=0;
        while(num>0)
		{
			 sum=sum+num%10;
			 num=num/10;
		}
		if(number%sum==0)
		{
			System.out.println("Harshad number");
		}
		else
		{
			System.out.println("Not harshad number");
		}
			
		}

	}


