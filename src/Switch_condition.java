// if a vowel is encountered it  prints as follows
 import java.util.Scanner;

public class Switch_condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet :");
        String str= sc.nextLine();
        str=str.toLowerCase();
        switch(str)
        {
            case "a":
                System.out.println("It is a vowel ");
                break;
            case "e":
                System.out.println("It is a vowel ");
                break;
            case "i":
                System.out.println("It is a vowel ");
                break;
            case "o":
                System.out.println("It is a vowel ");
                break;
            case "u":
                System.out.println("It is a vowel ");
                break;
        }
    }
}
