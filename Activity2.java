package ph.com.bpi.helloworld;

import java.util.Scanner;

public class Activity2 {

public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your age: ");
        String ageStr = scanner.nextLine();

        
        int ageInt = Integer.parseInt(ageStr);

        
        double ageDouble = (double) ageInt;

    
        System.out.println("Your age as an integer: " + ageInt);
        System.out.println("Your age as a double: " + ageDouble);

       
        scanner.close();
    }


}
