package ph.com.bpi.helloworld;

import java.util.Scanner;

public class activity1 {


public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

     
        System.out.println("Hello, " + name + "!");


        scanner.close();
    }

	
}
