//Checks if a number is greater  than 100 if yes prints the statement within the if block or within the else block


import java.util.Scanner;

public class If_else_condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number :");
        num = sc.nextInt();
        if (num > 100) {
            System.out.println("The number is greater than 100");
        }
        else {
            System.out.println("The number is less than 100");
        }
    }
}
