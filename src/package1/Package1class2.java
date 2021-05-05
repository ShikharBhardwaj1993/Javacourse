package package1;

public class Package1class2 {

	protected int l;
	
	
	public void sayhi(){
		
		System.out.println("sayhi");
		
	}
	
	
	public static void main(String[] args){
		
		Package1class2 abc = new Package1class2();
		
		System.out.println(abc.l);
		abc.sayhi();
		
		Package1class2 xyz = new Package1class2();
		
			System.out.println(xyz.l);
			abc.sayhi();
			
		
	}
	
	
	
	
	
}
