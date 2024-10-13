package Basic;

public class Compare_two_strings_lexographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s1="hello";
            String s2="olleh";
             int result=s1.compareTo(s2) ;
             if(result<0)
             {
            	System.out.println("yes it is lexographically"); 
             }
             else
             {
            	 System.out.println("no its not lexographically");
             }
	}

}
