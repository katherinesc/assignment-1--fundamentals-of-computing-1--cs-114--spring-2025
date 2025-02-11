// Import libraries here

import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here
    System.out.println("KKK\tKKK\tCCCCCCCCCCC\n" +
    "KKK\t\bKKK\tCCCCCCCCCCC\n" + "KKK\t\b\bKKK\tCCC\n" +
    "KKK\t\b\b\b\bKKKK\tCCC\n" + "KKK\t\b\b\bKKK\tCCC\n" +
    "KKK\t\b\bKKK\tCCCCCCCCCCC\n" + "KKK\tKKK\tCCCCCCCCCCC\n" );

    System.out.println();

    int Fahrenheit;
    double Celsius;

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number in Fahrenheit: ");
    Fahrenheit = scan.nextInt();

    Celsius = (Fahrenheit - 32) + 5 / 9 ;
    System.out.println("Celsius: " + Celsius);

    scan.close();

    System.out.println();



  }
}
