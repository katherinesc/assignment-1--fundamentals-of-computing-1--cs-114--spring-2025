// Import libraries here

import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here
    System.out.println("KKK\tKKK\tCCCCCCCCCCC\n" +
    "KKK\t\bKKK\tCCCCCCCCCCC\n" + "KKK\t\b\bKKK\tCCC\n" +
    "KKK\t\b\b\b\bKKKK\tCCC\n" + "KKK\t\b\b\bKKK\tCCC\n" +
    "KKK\t\b\bKKK\tCCCCCCCCCCC\n" + "KKK\tKKK\tCCCCCCCCCCC\n" );



    int Fahrenheit;
    double Celsius;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number in Fahrenheit: ");
    Fahrenheit = scan.nextInt();

    System.out.println();

    Celsius = (Fahrenheit - 32) + 5 / 9 ;



    String FiveCharacterString, ChangedString;

    System.out.println("Enter a 5-character string: ");
    FiveCharacterString = scan.next();

    ChangedString = FiveCharacterString.substring(1, 4);

    char[] ReversedString = ChangedString.toCharArray();
    char temp = ReversedString[0];
    ReversedString[0] = ReversedString[2];
    ReversedString[2] = temp;

    String swappedString = new String(ReversedString);

    System.out.println();

    scan.close();



    Random generator = new Random();
    int RandomNumber;

    RandomNumber = generator.nextInt(16385) +  32;

    System.out.println("Generating random number...");
    System.out.println();

    System.out.println("The new string is: " + Celsius + swappedString
    + RandomNumber);

  }
}
