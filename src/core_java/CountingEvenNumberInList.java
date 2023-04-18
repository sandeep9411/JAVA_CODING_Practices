package core_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingEvenNumberInList {

    // write your code here
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n= sc.nextInt();

    List<Integer> ls= new ArrayList<Integer>();

    int count=0;

   for (int i=0 ; i< n ; i++)
    {
        int k= sc.nextInt();

        ls.add(i,k);

        if(k%2==0)
        {

            count++;
        }

    }

   System.out.println(count);


}
}
