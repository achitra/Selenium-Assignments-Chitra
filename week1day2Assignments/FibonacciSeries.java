package week1.day2.Assignments;

public class FibonacciSeries {

    public static void main(String[] args) {
        
        int current = 1;
        int previous = 0;
        int range = 20;
        int fib=0;
        for(int i=0;i<range;i++)
        {
            System.out.print(fib+" ");
            previous=current;
            current=fib;
            fib = current+previous;
            
        }

    }
    
}
