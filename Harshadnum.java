package Basic;

public class Harshadnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=171;
int num=number;
int sum=0;

while(num>0)
{
	sum=sum+num%10;
	num=num/10;
}
if(num%sum==0)
{
	
	System.out.println("harshad number");
}
else
{
	System.out.println("not a harshad number");
}

	}

}
