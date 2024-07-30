import java.util.Scanner;
public class Rectangle {
	
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			int l=sc.nextInt();
			int b=sc.nextInt();

			System.out.println(area(l,b));
			System.out.println(perimeter(l,b));
			
		}

		public static int area(int l,int b)
		{
			int area=l*b;
			return area;
		}
		public static int perimeter(int l,int b)
		{
			int perimeter= 2*(l+b);
			return perimeter;
		}
	

}
