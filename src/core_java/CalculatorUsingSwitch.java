package core_java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculatorUsingSwitch {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int number1 , number2;

        String choice = "Yes" ;

        while(choice.equalsIgnoreCase("Yes"))
        {
            System.out.println("1. Addition\n" + "2. Subtraction\n" + "3. Multiply\n" + "4. Division");

            System.out.println("Enter your calculator operation");
            int calChoice = sc.nextInt();
            switch (calChoice) {

                case 1:
                    System.out.println("Enter 1st number");
                    number1=sc.nextInt();
                    System.out.println("Enter 2nd number");
                    number2=sc.nextInt();
                    System.out.println("Sum = " +(number1 +number2));
                    System.out.println("Do you want to perfrom another operation . Please Yes or No");
                    choice=sc.next();
                    break;
                case 2:
                    System.out.println("Enter 1st number");
                    number1=sc.nextInt();
                    System.out.println("Enter 2nd number");
                    number2=sc.nextInt();
                    System.out.println("Sub = " +(number1 -number2));
                    System.out.println("Do you want to perfrom another operation . Please Yes or No");
                    choice=sc.next();
                    break;
                case 3:
                    System.out.println("Enter 1st number");
                    number1=sc.nextInt();
                    System.out.println("Enter 2nd number");
                    number2=sc.nextInt();
                    System.out.println("Multiply = " +(number1 * number2));
                    System.out.println("Do you want to perfrom another operation . Please Yes or No");
                    choice=sc.next();
                    break;
                case 4:
                    System.out.println("Enter 1st number");
                    number1=sc.nextInt();
                    System.out.println("Enter 2nd number");
                    number2=sc.nextInt();
                    System.out.println("Division = " +(number1 / number2));
                    System.out.println("Do you want to perfrom another operation . Please Yes or No");
                    choice=sc.next();
                    break;

                default:

                    System.out.println("You have entered wrong choice . Please enter 1-4 for calculator operation");
                    System.out.println("Do you want to perfrom another operation . Please Yes or No");
                    choice=sc.next();



            }

        }

        }

    }

