package week3.week3day4Assignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListMissingElement {

   public static void main(String[] args) {
        
        List<Integer> list= new ArrayList<>();
        list.add(13);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        //Sort the list
        list.sort(Comparator.naturalOrder());

        //Print the sorted list
        System.out.print("Sorted List :");
        for(int num:list)
        {
            System.out.print(num+" ");
        }

        //Find missing elements
        System.out.print("\nMissing Element: ");
        int j;
        for(int i=1;i<=list.getLast();i++)
        {
            for(j=0;list.get(j)<=i;j++)
            {
                if(list.get(j) == i)
                {
                    break;
                }
            }

            if(list.get(j) != i)
            {
                System.out.print(" "+i);
            }
        }
    }   
}
