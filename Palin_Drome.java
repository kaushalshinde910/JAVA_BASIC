package Basic;
public class Palin_Drome
{
	public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int reversedNum = 0;

        while (num > 0) {
            int rem = num % 10;
            reversedNum = reversedNum * 10 + rem;
            num = num / 10;
        }

        if (temp == reversedNum) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}


