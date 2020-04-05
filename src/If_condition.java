//Checks whether the number is greater than 100 using if condition
import java.util.Scanner;

public class If_condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        if(num>100)
        {
            System.out.println("The number is greater than 100");
        }
    }
}
