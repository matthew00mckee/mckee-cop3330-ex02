/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/

package Exercise_2;

import java.util.Scanner;

public class CountNum {
    public static void main (String[] args){
        System.out.print ("What is the input string? ");
        Scanner input = new Scanner(System.in);
        String Input_String = input.nextLine();

        int x = Input_String.length();

        System.out.print(Input_String + " has " + x + " characters.");
    }
}
