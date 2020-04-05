//Remove white spaces from a sentence using for loop

import java.util.Scanner;

public class For_condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");      //Enter a sentence
        String str=sc.nextLine();   //input a string
        char[] str2 = new char[str.length()];
        int i, j = 0;             //i=looping and j= for storing the new string without spaces
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')               //if there is a white space then continue
                continue;
            else {
                str2[j] = str.charAt(i);          //else insert the characters into the new string
                j++;
            }
        }
        System.out.println("After removing white spaces : ");
        for (i = 0; i < str2.length; i++) {
            System.out.print(str2[i]);
        }
    }
}
