package Basic;

public class Biggest_Element_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int []a= {82,65,1,89,45,26};
         int max =a[0];
         for(int i=1;i<a.length;i++)
         {
        	 if(max<a[i]) {
        	 max=a[i];
         }
         }
	
	System.out.print(max);
	}
}
