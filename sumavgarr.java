package Basic;

public class sumavgarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {1,2,3,4,5,6,7,8};
        int sum=0;
         
        for(int i=0;i<=a.length;i++)
        {
        	sum=sum+i;
        }
        System.out.println(sum);
        System.out.println(sum/a.length);  
      
	}

}
