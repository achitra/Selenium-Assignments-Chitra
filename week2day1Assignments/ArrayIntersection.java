package week2.day1.week2day1Assignments;

public class ArrayIntersection {

    public static void main(String[] args) {
        
        int a[] = {3,2,11,4,6,7};
        int b[] = {1,2,8,4,9,7};
        int i,j;

        System.out.println("Matching Numbers : ");

        for(i=0;i<a.length;i++)
        {
            for(j=1;j<b.length;j++)
            {
                if(a[i] == b[j])
                {
                    System.out.print(a[i]+",");
                }
            }
        }
    
    

    }
    
}
