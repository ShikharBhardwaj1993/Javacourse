package assignments;
import java.util.Scanner;
public class Peek {

	public static void main(String[] args){
		
		Scanner inp = new Scanner(System.in);
		
		
		String N1 = inp.next();
		
		String N2 = inp.next();
		
//		System.out.println(N1);
//		System.out.println(N2);
		String k = ""; 
		for (int i =0; i<N1.length();i++){
			
			for(int j=0; j<N2.length();j++){
				
				if(N1.charAt(i)==N2.charAt(j)){
					
					k = k + N1.charAt(i);
					break;
					}
				}			
		}
	
		//System.out.println(k);
		
		if((k.equals(N1)) && (N2.length()==N1.length()) ){
			
//			if(k.length()==N1.length()){
				
				System.out.println("It is Anagram");
//			}
			
		}
		else {
			
			System.out.println("It is not Anagram");
		}
		
	}
	
	
	
	
	
}
