package Basic;

public class strToNum {
    public static void main(String[] args) {
        // Convert string to integer
        String str = "12345";
        int number = Integer.parseInt(str);
        System.out.println("The number converted into int: " + number);
        
        // Instantiate inner class and call its method
        strToNum outer = new strToNum();
        Car myCar = outer.new Car();
        myCar.car();
    }
    
    // Inner class
    class Car {
        void car() {
            String carBrand = "Mercedes";
            System.out.println("Car brand: " + carBrand);
        }
    }
}
