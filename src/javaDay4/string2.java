package javaDay4;

public class string2 {

	static int l =10;
	int b =20;
	int h =30;
	String name = "Hoggard" ; 
	
	//string2(int x,int y){
	//l = x;
	//b = y;
	//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		string2 obj = new string2() ;
		
		string2.l++;
		System.out.println(string2.l);
		System.out.println(obj.b);
		System.out.println(obj.h);
		
		
		string2 bjj = new string2() ; 
	
		string2.l++;
		System.out.println(string2.l);
		System.out.println(bjj.b);
		System.out.println(bjj.h);
	
	}
	

}
