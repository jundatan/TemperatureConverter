/**
 * This is a simple Temperature converter from Celsius to Farenheit or Farenheit to Celsius.
 * Version 0.1.0 (11/10/22)
 * @author ProContributor
 */

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = 0;
        int choice;

        while (true) {
            System.out.println("Welcome to the Temperature Converter System: ");
            System.out.println("Key in your choice of conversion/exit: ");
            System.out.println("0 - Exit");
            System.out.println("1 - Degree Celsius to Farenheit");
            System.out.println("2 - Farenheit to Degree Celsius");    
            System.out.println("----------------------------------------------"); 
            choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Thank you for using the Temperature Converter System. Good Bye!");
                break;
            } else if (choice == 1) {
                System.out.println("Temperature in Degree Celsius: ");
                temperature = sc.nextDouble();
                temperature = temperature * 1.8 + 32;
                System.out.println("Result Temperature in Farenheit: ");
                System.out.printf("%.1f", temperature);
                System.out.println("");
            } else if (choice == 2) {
                System.out.println("Temperature in Farenheit: ");
                temperature = sc.nextDouble();
                temperature = (temperature - 32) / 1.8;
                System.out.println("Result Temperature in Degree Celsius: ");
                System.out.printf("%.1f", temperature);
                System.out.println("");
            } else {
                System.out.println("Please choose a valid choice.");
            }
            System.out.println("----------------------------------------------"); 
        }
        sc.close();
    }
}
