package Assignment3;
import java.util.Scanner;
public class Prog7 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int [] a =new int [6];

		for (int i=0;i<a.length ;i++ )
		{
			a[i]=sc.nextInt();
		}
		System.out.println(large(a));
		System.out.println(small(a));
	}

	public static int large(int [] array)
	{
		int large=0;
		for (int i=0;i<array.length ;i++ )
		{
			if (large<=array[i])
			{
				large=array[i];
			}
		}
		return large;
	}

	public static int small(int [] array)
	{
		int small=array[0];
		for (int i=0;i<array.length ;i++ )
		{
			if (small>=array[i])
			{
				small=array[i];
			}
		}
		return small;
	}
	
}

