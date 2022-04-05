package tamilnadu.chennai;

import java.util.Scanner;

public class ArrayLearn {
	int a[];
	int n ;
	 public static void main(String[] args) {
		 ArrayLearn a  = new ArrayLearn();
		// a.InputToArray();
		// a.DisplayArray();
		 System.out.println(args.length);
		 a.DisplayArray1();
	}

	private void DisplayArray1() {
		// TODO Auto-generated method stub.
		int [] x=  new int[10];
		
		x[0]=89;
		x[1]=77;
		
		for(int i = 0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
	}

	private void InputToArray() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.printf("\n Enter Number of Subjects : ");
		n=in.nextInt();
		 a=new int[n];
		int i=0;
		System.out.println(a.length);
		for(i=0;i<n;i++)
		{
			System.out.printf("\n Enter Mark %d : ",i+1);
			a[i]=in.nextInt();
		}
		
	}

	private void DisplayArray() {
		// TODO Auto-generated method stub
		
		int i=0,tot=0;
		for(i=n-1; i>=0;i--) {
			 	
			tot+=a[i];
				System.out.println(a[i]+" "+i);
		 
			
		}
		 
		System.out.printf("\n\n");
		System.out.println(" Total      : "+tot);
		System.out.println(" Avg        : "+tot/5);
		System.out.println(" Percentage : "+(tot/500.0)*100);
	}
	

}
