package core_java;

import java.util.Scanner;

public class palindrome_Number {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int number , temp =0;

        System.out.println("Enter the number");

        number= sc.nextInt();

        int num= number;


for(int i=number;number>0;number=number/10)
{

    int k = number%10;
     temp=temp*10+k;

}

if (temp == num)
{
    System.out.println("Number is plaindrome");
}
else
    System.out.println("Number is not palindrome");

    }


}
