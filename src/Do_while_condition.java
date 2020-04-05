//Based on the input it performs the following mathematical operations
import java.util.Scanner;

public class Do_while_condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        char ch;
        System.out.println("Enter the numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        do {
            System.out.println("Choose :");
            System.out.println("1.Additon");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("Enter the choice");
            ch = sc.next().charAt(0);
        }
        while (ch < '1' || ch > '4');
        switch(ch)
        {
            case '1':
                System.out.println("Addition");
                result = num1 + num2;
                System.out.println("Result = "+result);
                break;
            case '2':
                System.out.println("Subtraction");
                result = num1 - num2;
                System.out.println("Result = "+result);
                break;
            case '3':
                System.out.println("Multiplication");
                result = num1 * num2;
                System.out.println("Result = "+result);
                break;
            case '4':
                System.out.println("Division");
                result = num1 / num2;
                System.out.println("Result = "+result);
                break;
        }
    }
}
