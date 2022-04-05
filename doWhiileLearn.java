package tamilnadu.chennai;

import java.util.Scanner;

public class doWhiileLearn {
	
	public static void main(String[] args) {
		
		doWhiileLearn d = new doWhiileLearn();
		//d.funDO();
	//	d.funWhile();
		d.left();
	}

	private void left() {
		// TODO Auto-generated method stub
		
		System.out.println(5<<1);
		
	}

	public void funDO() {
		// TODO Auto-generated method stub
		int n=10 ;
		
		//Exit control loop 
		do 
		{
			System.out.println(n);
			n++;
		}while(n<=1);
		
	}
	
	public void funWhile() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n ;
		
		n=sc.nextInt();
	
		
		 while(n<=100)
		 {
			 System.out.println(n);
			 n++;
			
		 }
 
		
	}
	
	

}
