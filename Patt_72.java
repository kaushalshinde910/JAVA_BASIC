package Basic;

public class Patt_72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=9;
		for(int i=1;i<=irange;i++)
		{
		for(int j=irange;j>i;j--)
		{
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
		System.out.print(j);
		}
		for(int j=i-1;j>=1;j--)
		{
		System.out.print(j);
		}
		System.out.println();
	}

	}
}
