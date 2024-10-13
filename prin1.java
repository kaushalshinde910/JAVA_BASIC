package Basic;

public class prin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num=4;
		 int cnt=0;
		 for(int i=2;i<num;i++)
		 {
			 if(num%i==0)
			 {
				 cnt++;
				 break;
			 }
		 }
			 if(cnt==0)
			 {
				 System.out.println("prime");
				 
			 }
		 
			 else
			 {
				 System.out.println("not prime");
			 }
		 }
			

	}


