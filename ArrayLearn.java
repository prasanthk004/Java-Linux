package tamilnadu.chennai;

import java.util.Scanner;

public class ArrayLearn {
	int a[];
	int n ;
	 public static void main(String[] args) {
		 ArrayLearn a  = new ArrayLearn();
		// a.InputToArray();
		// a.DisplayArray();
		 
		// a.DisplayArray1();
		 a.FindMax();
	}
	 
	 private void FindMax() {
			// TODO Auto-generated method stub
			int[] marks= {5,80,45,80,5};
			
			int max=-2147483648,  smax= -2147483648,min=2147483647,smin=2147483647;
			int i ;
			for(i=0;i<marks.length;i++)
			{
				if(marks[i]>max)
				{
					smax=max;
					max=marks[i];
				}
				else if(marks[i]>smax&&marks[i]!=max)
				{
					smax=marks[i];
				}
				
				if(marks[i]<min)
				{
					smin=min;
					min=marks[i];
					
				}
				else if(marks[i]<smin)
				{
					smin=marks[i];
				}
				
				 
			}
			//Finding second maximum & minimum
			
			/*for(i=0;i<marks.length;i++)
			{
				if(marks[i]>smax&&marks[i]!=max)
				{
					System.out.println(marks[i]);
					smax=marks[i];
				}
				
				
				
				 
			}*/
			
			System.out.println("First Maximum Mark   : "+max);
			System.out.println("Second Maximum Mark  : "+smax);
			System.out.println("Minimum Mark         : "+min);
			System.out.println("Second Minimum Mark  : "+smin);
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
