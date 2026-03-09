package week2.day1.week2day1Assignments;

public class Prime {
    public static void main(String[] args) {
        
        int num = 27,i;
        for(i=2;i<num;i++)
        {
            if(num%i == 0)
            {
                System.out.println("Number is not prime!");
                break;
            }
        }
        if(i==num)
            System.out.println("Number is prime!");
    }

}
