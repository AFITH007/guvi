import java.lang.*; 
import java.io.*; 
import java.util.*; 


class ReverseString 
{ 
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine(); 
        char[] try1 = input.toCharArray(); 
        for (int i = try1.length-1; i>=0; i--) 
			System.out.print(try1[i]); 
	} 
} 
