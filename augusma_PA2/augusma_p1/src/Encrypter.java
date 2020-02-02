// Reneau Augusma
// COP 3330, Spring 2020
// Programming Assignment 2 - Problem 1

public class Encrypter
{
    public static void swap(int[] number, int a, int b)
    {
        int temp = number[a];
        number[a] = number[b];
        number[b] = temp;
    }

    public static String encrypt(String input)
    {
        int i;
        int[] digits = new int[4];
        String result = "";

        for (i = 0; i < input.length(); i++)
        {
            digits[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
            digits[i] = (digits[i] + 7) % 10;
        }

        swap(digits, 1, 3);
        swap(digits, 0, 2);

        for (i = 0; i < digits.length; i++)
            result += String.valueOf(digits[i]);

        return result;
    }
}
