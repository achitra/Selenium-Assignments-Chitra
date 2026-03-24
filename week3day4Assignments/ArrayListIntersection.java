package week3.week3day4Assignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListIntersection {

    public static void main(String[] args) {
        
        List<Integer> list1 = new ArrayList<>();

        list1.add(3);
        list1.add(2);
        list1.add(11);
        list1.add(4);
        list1.add(6);
        list1.add(7);

        List<Integer> list2= new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(8);
        list2.add(4);
        list2.add(9);
        list2.add(7);

        //Print both lists
        System.out.print("List 1 :");
        for(int num:list1)
        {
            System.out.print(num+" ");
        }
        System.out.print("\nList 2 :");
        for(int num:list2)
        {
            System.out.print(num+" ");
        }

        System.out.print("\nList Intersection :");

        for(int i=0;i<list1.size();i++)
        {
            for(int j=0;j<list2.size();j++)
            {
                if(list1.get(i) == list2.get(j))
                {
                    System.out.print(" "+list1.get(i));
                    break;
                }
            }
        }

    }
    
}
