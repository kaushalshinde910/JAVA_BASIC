package Basic;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
         int cnt=0;
         {
        	 for(int i=2;i<=num;i++)
        	 {
        		 if(num%i==0)
        		 {
        			 cnt++;
        		 }
        	 } 
        	 if(cnt==2)
        	 {
        		 System.out.println("prime");
        	 }
        	 else
        	 {
        		 System.out.println("not prime");
        	 }
        	 
         }
	}

}
