package Assignment3;

public class Prog1 {
public static void main(String[] args) {
	
	String s="Umbrella";
	
	String lowerCase=s.toLowerCase();
	
	if(lowerCase.contains("e")) {
		System.out.println("The letter e is present in word");
	}
	else {
		System.out.println("The letter e is not present");
	}
}
}
