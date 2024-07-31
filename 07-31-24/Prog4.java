package Assignment;
import java.util.Iterator;
import java.util.Scanner;
public class Prog4 {

	public static void main(String[] args) {
		int count=10;
		 
		System.out.println("Enter count of number: ");
		Scanner sc=new Scanner(System.in);
		
		int num,sum=0;
		float avg=0;
		for(int i=0;i<count;i++)
		{
			num=sc.nextInt();
			sum=sum+num;
		}
		avg=sum/count;
		System.out.println(avg);
		}
}
