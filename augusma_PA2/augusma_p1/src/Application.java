// Reneau Augusma
// COP 3330, Spring 2020
// Programming Assignment 2 - Problem 1

import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        String number;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a four digit integer. ");
        number = input.next();

        System.out.println("Your number entered: " + number);
        System.out.println("The encrypted number: " + Encrypt.encrypt(number));
        System.out.println("The decrypted number: " + Decrypt.decrypt(number));
    }
}
