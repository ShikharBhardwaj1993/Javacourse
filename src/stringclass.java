
import java.util.Scanner;

public class stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String N1 = "Abh" ;
//
//		//int k = N1.length();
//		String output = "";
//		
//		for ( int i= N1.length()-1 ; i>=0  ; i--){
//			
//			
//			output = output + N1.charAt(i);
//			//System.out.print(N1.charAt(i));
//			
//		
//		}
//		
//		System.out.print(output);//when ever you add something with string it becomes string
//		


//		
//		Scanner inp = new Scanner(System.in);
//		
//		
//		String N3 = inp.next(); 
//		
//		//"qwdfrgthyujbgfrtyuiky";
//		
//		int k = N3.length();
//		//System.out.print(N3.length());		
//		if(k%2==0){
//			
//			//System.out.print(k/2+1);
//		int j =k/2+1;
//		//System.out.print(N3.charAt(j));
//		System.out.print(N3.substring(j-2,j+1));
//		
//		}
//		else {
//			
//			
//			//System.out.print((k+1)/2);
//			
//			int e =(k+1)/2;
//			//System.out.print(N3.charAt(j));
//			//System.out.print(N3.charAt(e));
//			System.out.print(N3.substring(e-2,e+1));
//		
//		
//		}
		
		

		//String N4 = "Ajay is";
		
		Scanner inp = new Scanner(System.in);
		String T = inp.nextLine();
		StringBuffer G = new StringBuffer(T);
		//for (int i = G.length(); i>0 ; i--){
		
		String O = G.reverse().substring(0);
		System.out.print(O);
		//System.out.print(G.reverse().substring(3,7));
		//System.out.print(G.reverse().substring(3,7));
		
		}
		
	
	
	}


