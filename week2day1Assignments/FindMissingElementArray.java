package week2.day1.week2day1Assignments;

public class FindMissingElementArray {

    public static void main(String[] args) {
        
        int arr[] = {1,4,3,2,8,5,7};
        int i,j;

        for(i=1;i<=arr.length+1;i++)
        {
            for(j=0;j<arr.length;j++)
            {
                if(i == arr[j])
                    break;
            }
            if(j == arr.length)
                System.out.println("Missing number : "+i);
        }

    }
    
}
