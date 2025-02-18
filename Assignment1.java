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

    System.out.println("Enter a number in Fahrenheit: ");
    Fahrenheit = scan.nextInt();

    Celsius = (Fahrenheit - 32) + 5 / 9 ;
    System.out.println("Celsius: " + Celsius);

    System.out.println();


    String FiveCharacterString, ChangedString;


    System.out.println("Enter a 5-character string: ");
    FiveCharacterString = scan.next();

    System.out.println("5-character string: " +FiveCharacterString);

    ChangedString = FiveCharacterString.substring(1, 4);

    System.out.print("Changed string: "+ChangedString);
    scan.close();






  }
}
