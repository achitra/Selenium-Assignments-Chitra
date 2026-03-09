package week2.day1.week2day1Assignments;

public class Palindrome {

    public static void main(String[] args) {
        
        int num = 123454321;
        int originalNum = num;
        int reverseNum = 0,remainder;

        for(int i=num;i>0;i/=10)
        {
            remainder = num%10; 
            reverseNum = reverseNum*10+remainder;
            num = num/10;
        }

        if(originalNum == reverseNum)
            System.out.println("Number is palindrome!");
        else
            System.out.println("Number is not palindrome!");

    }
    
}
