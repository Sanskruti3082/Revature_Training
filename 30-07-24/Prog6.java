import java.util.Scanner;
public class Prog6 {

	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		double fahrenheit=sc.nextDouble();
		double celsius;
	 celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
		
		System.out.println(celsius);
	}
}
