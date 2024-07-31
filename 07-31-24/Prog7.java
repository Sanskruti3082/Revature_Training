package Assignment;
import java.util.Scanner;
public class Prog7 {
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
	
			int n1=sc.nextInt();
			int n2=sc.nextInt();
	        
			int largest=n1>n2?n1:n2;

	
			int HCF=1;

	if (n1>0 && n2>0)
	{

			for (int i=largest/2;i>=2 ;i--)
			{
				//check for CF
				if (n1%i==0 && n2%i==0)
				{
					HCF=i;
					break;
				} //end of if
				
			 }//end of for
	   System.out.println(HCF);

	}
	else{
		System.out.println("Enter valid no.");
	    }

	}
	}

