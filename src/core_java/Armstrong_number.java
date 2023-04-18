package core_java;

import java.util.Scanner;

public class Armstrong_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int num=143;

        int temp =num , sum=0;

        while(num>0)
        {
            int k= num%10;
             sum=(int)(sum+Math.pow(k,3));
             num=num/10;

        }

        if(temp==sum)
        {
            System.out.println("Number is armstrong");
        }

        else
            System.out.println("Number is not armstrong");

    }
}
