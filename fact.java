import java.lang.*; 
import java.io.*; 
import java.util.*; 
class Factorial {

    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
           
            factorial *= i;
        }
        System.out.printf("\n %d", factorial);
    }
}
