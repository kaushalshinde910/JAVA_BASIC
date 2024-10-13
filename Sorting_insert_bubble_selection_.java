package Basic;
import java.util.*;
public class Sorting_insert_bubble_selection_ {
public static void Printarray(int arr[])
{
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Bubble sorting sort.78312(big size of number we we push it up)
		//final answer is 12357.
		int arr[]= {7,8,3,2,1};
		for(int i=0;i>arr.length-1;i++)
		{
		for(int j=0;j<arr.length-i-1;j++)
		{
			if(arr[i]>arr[i+1]) {
				//swap
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		}
		
	}

}
