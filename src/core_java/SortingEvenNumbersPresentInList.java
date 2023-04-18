package core_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SortingEvenNumbersPresentInList {
    public static void main(String[] args) {



        List<Integer> list = new ArrayList<Integer>();

        list.add(5);
        list.add(15);
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(10);




        findEvenNumberAndSort(list);


    }

    public static void findEvenNumberAndSort(List<Integer> arrayList) {
        // your code
        List<Integer> list1 = new ArrayList<Integer>();
        for(int i= 0; i<arrayList.size();i++)
        {
            if (arrayList.get(i)%2==0)
            {
                list1.add(arrayList.get(i));

            }
        }

        System.out.println(list1);

        int temp=0;
        for(int k=0;k<list1.size();k++)
        {
            for (int j=k+1; j<list1.size();j++)
            {
                if(list1.get(k)>list1.get(j))
                {
                    temp=list1.get(k);
                    list1.set(k,list1.get(j));
                    list1.set(j,temp);

                }
            }
        }
        System.out.print(list1);

    }
}