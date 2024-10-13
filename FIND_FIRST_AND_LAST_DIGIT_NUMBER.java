package Basic;

public class FIND_FIRST_AND_LAST_DIGIT_NUMBER {
    public static void main(String[] args) {
        int n = 98562;
        int lastDigit = n % 10;
        int firstDigit = n;
        
        // Loop to find the first digit
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        
        // Print the results
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
    }
}
