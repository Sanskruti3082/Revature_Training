import java.util.Scanner;
public class Prog10
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

       //s1: read 1 no.
		int n=sc.nextInt();

		//logic for reverse
		//initialize rev to 0
        int rev=0;
		int temp=n;

		while (n!=0)
		{
		int digit=n%10;
		rev=rev*10+digit;
		n=n/10;
		}
		System.out.println(rev);
	}
}