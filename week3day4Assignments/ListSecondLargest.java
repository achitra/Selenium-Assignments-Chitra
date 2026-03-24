package week3.week3day4Assignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSecondLargest {
    public static void main(String[] args) {
        
        List<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(11);
        list.add(4);
        list.add(6);
        list.add(7);

        //Sort the list
        list.sort(Comparator.naturalOrder());

        //Print the sorted list
        System.out.print("Sorted List :");
        for(int num:list)
        {
            System.out.print(num+" ");
        }

        //Print second largest
        System.out.print("\nSecond Largest : "+list.get(list.size()-2));

    }

}
