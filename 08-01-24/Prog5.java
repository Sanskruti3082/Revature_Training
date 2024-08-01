package Assignment3;
import java.util.Scanner;
public class Prog5 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int [] a=new int[6];
		int count=0;
		for (int i=0;i<a.length ;i++ )
		{
			a[i]=sc.nextInt();
			count++;
		}
		System.out.println(sum(a));
		System.out.println(prod(a));
	}

	public static int sum(int [] array)
	{
		
		int sum=0;
		
		for (int i=0;i<array.length ;i++ )
		{
             sum=sum+array[i];
			
		}
		return sum;
	}
   
	public static int prod(int [] array)
	{
	
		int prod=1;
		for (int i=0;i<array.length ;i++ )
		{
			prod=prod*array[i];
			
		}
		return prod;
	}
}
