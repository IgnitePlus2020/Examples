//if-else-if ladder
//Program checks the season based on the user input

import java.util.Scanner;

public class If_else_if_Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.println("Enter the month(1-12) : ");   //eg: Jan=1,Feb=2,....
        month=sc.nextInt();
        if(month==12||month==1||month==2)
            System.out.println("It is Winter Season ");
        else if(month==3||month==4||month==5)
            System.out.println("It is Spring season");
        else if(month==6||month==7||month==8)
            System.out.println("It is Summer season");
        else if(month==9||month==10||month==11)
            System.out.println("It is Autumn season");
        else
            System.out.println("Invalid input");
    }
}
