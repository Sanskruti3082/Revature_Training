package Assignment;
import java.util.Scanner;
public class Prog1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		
		if (l==b) {
			System.out.println("It is square");
		}
		else {
			System.out.println("It is not square");
		}
	}
}
