import java.util.Scanner;
public class Prog8 {

	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(firstDigit(num)+secLast(num));
		
		
			
	}
	
	public static int firstDigit(int n)
	{
		while(n>=10)
		{
			n /=10;
		}
		return n;
	}
	
	public static int secLast(int n)
	{
			return n%10;
		
	}
}
