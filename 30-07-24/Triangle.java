import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
        int c=sc.nextInt();
		System.out.println(perimeter(a,b,c));
		
	}
	
	public static int perimeter(int a,int b,int c)
	{
		int perimeter= a+b+c;
		return perimeter;
	}
}
