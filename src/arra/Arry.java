package arra;
import java.util.Scanner;
import java.util.Arrays;

public class Arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		
		String So = inp.nextLine();
		String R = "";
		
		String[] F = So.split(" ");
		
		//System.out.print(Arrays.toString(F));
		
		for (int i =0; i<F.length ; i++ ){
			
			StringBuffer SB = new StringBuffer(F[i]);
			
			R = R + SB.reverse().toString() + " ";
			
		}
		
		System.out.print(R);
		
		
		
	}

}
