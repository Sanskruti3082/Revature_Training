package Assignment;

import java.util.Scanner;
public class Prog8
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

		int temp=num;

		int count=0;

if (num>0)
{

		while (num!=0)
		{
			num /=10;
			count++;
		}

		int m=count; 
      
        int sum=0;

        num=temp;  
		
		while (num!=0)
		{   
			
			int d=num%10;

			int power=1;
			for (int i=1;i<=m ;i++ )
		    {
			   power=power*d;
		    }
			
			sum=sum+power;
		
			num/=10;

		}
		
		System.out.println(sum);
		
		 if (temp==sum)
		 {
			 System.out.println("Armstrong Number");
		 }
		 else{
			System.out.println("Not Armstrong Number");
		 }
}


else{
	System.out.println("invalid");
}

}
}
