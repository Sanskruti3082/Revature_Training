import java.util.Scanner;

public class Prog4 {

	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int eng=sc.nextInt();
		int maths=sc.nextInt();
		int hindi=sc.nextInt();
		
		int total=eng+maths+hindi;
		double percentage=((total*100)/300);
		System.out.println(total);
		System.out.println(percentage);
	}
}
