package Assignment3;

import java.util.Scanner;

public class Prog4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int a[]=new int[5];
	for(int i=0;i<5;i++)
	{
		a[i]=sc.nextInt();
	}
	
	int size=a.length;
	int [] b=new int[size];
	
	//reverse
	for(int i=0;i<size;i++)
	{
		b[size-i-1]=a[i];
	}
	
	for(int i=0;i<size;i++) {
		System.out.println(b[i]);
	}
}
}
