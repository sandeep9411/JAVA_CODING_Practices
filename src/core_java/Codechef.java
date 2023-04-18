package core_java;
import java.util.Scanner;
import java.util.Scanner;
class Codechef
{
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            int a = read.nextInt();
            int b = read.nextInt();
            // Update your code below this line to solve the problem
            int sum=a;
            for( int j=1; j<=b; j++)
            {
                if(j%2==1 && sum<=b)
                {
                    sum= sum+1;

                    if(sum==b)
                    {
                        System.out.println("YES");
                        break;
                    }
                }
                else if(j%2==0 && sum<=b)
                {
                    sum =sum+2;
                    if(sum==b)
                    {
                        System.out.println("YES");
                        break;
                    }
                }
                else if(sum>b)
                {
                    System.out.println("NO");
                }


            }
        }
    }
}