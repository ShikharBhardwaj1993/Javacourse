 
public class cl2 {


	public void getstr(){
		
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter any group of characters");
		String N3 = inp.next(); 
		
		//"qwdfrgthyujbgfrtyuiky";
	
		int k = N3.length();
		//System.out.print(N3.length());		
		if(k%2==0){
			
			//System.out.print(k/2+1);
		int j =k/2+1;
		//System.out.print(N3.charAt(j));
		System.out.print(N3.substring(j-2,j+1));
		
		}
		else {
			
			
			//System.out.print((k+1)/2);
			
			int e =(k+1)/2;
		//System.out.print(N3.charAt(j));
			//System.out.print(N3.charAt(e));
			System.out.print(N3.substring(e-2,e+1));
		
		
	}
		

	}
	
	
	
	public static void main(String[] args) {



		cl2 rfg = new cl2();
		
		rfg.getstr();
		
		
		
		
		
		
		
		
	}

}
