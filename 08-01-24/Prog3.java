package Assignment3;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,i;
		int p=0,c=0,e=0,o=0,z=0;
		
		for(i=1;i<=10;i++)
		{
			System.out.println("Enter a no.");
			n=sc.nextInt();
			
			if(n>0)
			{
				p++;
			}
			if(n<0)
			{
				c++;
			}
			if(n%2==0)
			{
				e++;
			}
			if(n%2!=0)
			{
				o++;
			}
			if(n==0)
			{
				z++;
			}
		}
		System.out.println("Positive numbers "+p);
		System.out.println("negative numbers "+c);
		System.out.println("even numbers "+e);
		System.out.println("odd numbers "+o);
		System.out.println("zero's "+z);
		
		
}
	
}
