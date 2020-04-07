//Program to convert feet and inches into centimeters by using method overloading


import java.util.Scanner;

public class Method_Overloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Which of following do you want ");
            System.out.println("1.Enter both feet and inches ");
            System.out.println("2.Enter only inches");
            choice = sc.nextInt();                          //input choice
        } while (choice < 1 || choice > 2);
        switch (choice) {                                  //switch case begins
            case 1:   //input for 2 parameter method
                System.out.println("Both feet and inches was selected ");
                System.out.println("Enter the feet : ");
                double feet = sc.nextDouble();
                System.out.println("Enter the inches : ");
                double inches = sc.nextDouble();
                double centimeters = calcFeetAndInchesToCentimeters(feet, inches);      //method calling(2 parameters)
                if (centimeters < 0.0) {                             //checking for invalid condition
                    System.out.println("Invalid parameters");
                }
                break;

            case 2: //input for 1 parameter method
                System.out.println("only inches was selected ");
                System.out.println("Enter the inches : ");
                inches = sc.nextDouble();
                calcFeetAndInchesToCentimeters(inches);  //method calling(1 parameter)
                break;

        }
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {            //checking for invalid values
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        //1foot = 12inches and 1 inch = 2.54 cm
        double centimeters = (feet * 12) * 2.54;  //converting feet into centimeters
        centimeters += inches * 2.54;           //converting inches into centimeters
        System.out.println(feet + " feet, " + inches + " inches "+ centimeters + " centimeters");
        return centimeters;    //returns back to the main function
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if ((inches < 0)||(inches>12)) {                   //checking for invalid condition
            System.out.println("Invalid inches value given");
            return -1;
        }
        double feet = (int) inches / 12;      //converting the inches into feet
        double remaininginches = (int) inches % 12;    //by using modulus you get the remaining inches
        return calcFeetAndInchesToCentimeters(feet, remaininginches);  //sending both the feet and the remaining inches
                                                                       //to the before method with two parameters
    }
    }