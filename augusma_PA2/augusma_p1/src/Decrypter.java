// Reneau Augusma
// COP 3330, Spring 2020
// Programming Assignment 2 - Problem 1

public class Decrypter
{
    public static void swap(int[] number, int a, int b)
    {
        int temp = number[a];
        number[a] = number[b];
        number[b] = temp;
    }

    public static String decrypt(String input)
    {
        int i;
        int[] digits = new int[4];
        String result = "";

        for (i = 0; i < input.length(); i++)
            digits[i] = Integer.parseInt(String.valueOf(input.charAt(i)));


        swap(digits, 3, 1);
        swap(digits, 2, 0);

        for (i = 0; i < 4; i++)
        {
            if (digits[i] - 7 < 0)
                digits[i] = (digits[i] + 10) - 7;

            else
                digits[i] = (digits[i] - 7) % 10;
        }

        for (i = 0; i < digits.length; i++)
            result += String.valueOf(digits[i]);

        return result;
    }
}
