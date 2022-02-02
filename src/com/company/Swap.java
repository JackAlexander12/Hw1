//Jack Alexander in CSC1302
//2/1/2022
//Swap
//This swaps integer's numbers and it also swaps string's characters
package com.company;
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Please input a number to be swapped: ");
        int d=input.nextInt();
        int swapped=swapDigitPairs(d);
        System.out.println("The swapped result is: " + swapped);

        System.out.print("\nPlease input a string to be swapped: ");
        String si=input.next();
        String ssi=swapLetterPairs(si);
        System.out.println("The swapped result is: " + ssi);
    }

    public static int swapDigitPairs(int n) {
            int result = 0;
            int temp = 1;

            while(n > 0) {
                int d1 = n % 10;
                n /= 10;

                if(n == 0) {
                    result += temp * d1;
                    break;
                }

                int d2 = n % 10;
                result = result + temp * 10 * d1 + temp * d2;
                n /= 10;
                temp *= 100;
            }
            return result;
        }

    public static String swapLetterPairs(String string){
        String newString = "";

        for (int i = 0; i < string.length() / 2; i++) {
            newString += string.charAt(2 * i + 1);
            newString += string.charAt(2 * i);
        }

        if (string.length() % 2 != 0) {
            newString += string.charAt(string.length() - 1);
        }

        return newString;
    }
}
