package assignments;
import java.util.Scanner;
import java.util.Arrays;

public class Fact {

	public static void main(String[] args) {
	
	Scanner inp = new Scanner(System.in);
	System.out.print("Enter any no.");
	int G = inp.nextInt();
	int F = 1 ;	
	int[] abc = new int[G];
	
	//System.out.println(Arrays.toString(abc));
		
	for(int i = 0 ; i < abc.length; i++){
		
		abc[i] = i+1;
		F = F*abc[i];
		
	}
	
	System.out.print("Factorial value is " + F);
	
	}
}

 