package Assignment;
import java.util.Scanner;
public class Prog3 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int classes_held=sc.nextInt();
	int classes_attended=sc.nextInt();
	
	System.out.println(classes_held+" , "+classes_attended);
	
	
    double percentage=((classes_attended*100)/classes_held);
	
	if (percentage>75) {
		System.out.println("Allowed");
	}
	
	else {
	System.out.println("Was there any medical cause if yes enter 'Y' else enter 'N'");
	char input=sc.next().charAt(0);
	
	if (input=='Y' || input=='y') {
		System.out.println("Allow for exam");
	}
	
	else if (input=='N' || input=='n') {
		System.out.println("Dont allow");
	
	}
	}
}
}
