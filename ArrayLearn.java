package tamilnadu.chennai;

import java.util.Scanner;

public class ArrayLearn {
	int a[];
	int n ;
	 public static void main(String[] args) {
		 ArrayLearn a  = new ArrayLearn();
		// a.InputToArray();
		// a.DisplayArray();
		 //a.Sort();	
		// a.Seraching();
		 a.BinarySearch();
		// a.DisplayArray1();
		 //a.FindMax();
	}
	 
	 private void BinarySearch() {
		// TODO Auto-generated method stub
		 int[] ar = {10,20,30,35,42,57, 68,78, 79, 83, 99,100};
			//
	int key = 68; 
	int min =0,max =11;
	int mid=0 ;
	while(mid<max){
	  mid = (min+max)/2;	//5
	if(key == ar[mid])
	{System.out.println("Yes, key is present at "+ mid); 
	break; 
	}
	else if(key<ar[mid])
	{
	max = mid-1; 
	}
	else if(key>ar[mid]){
	min = mid+1;
	}
	} 
	
	if(mid>max)
	{
		System.out.println(" Unable to find the given number "+key);
	}
	
	
	}
	 
	

	private void Seraching() {
		// TODO Auto-generated method stub
	    char[] c = {'a','c','d','x'};
	    
	    int i ;
	    int found=0 ;
	    char ch;
	    Scanner sc=new Scanner(System.in);
	    System.out.print(" Enter the char to find : ");
	    ch=sc.next().charAt(0);
	    
	    for(  i=0;i<c.length;i++)
	    {
	    	if(c[i]==ch)
	    	{
	    		found=1;
	    		System.out.println("Character "+ch+" Present in pos "+i);
	    	}
	    }
	    
	    if(found==0)
	    {
	    	System.out.println(" Unable to find the character ");
	    }
	}

	private void Sort() {
		// TODO Auto-generated method stub
		 int[] ar = {5,8,11,15}; 
		 int temp=0; 

		 int j ;
		 
		 for(j=0;j<ar.length;j++)
		 {
			 for(int i=0;i<ar.length-1; i++)
			 {
			 if(ar[i]<ar[i+1])
			 {
			 temp = ar[i]; 
			 ar[i] = ar[i+1]; 
			 ar[i+1] = temp; 		 		
			 }
			 }
			 
		 }
		 
		 
		 
		 for( j=0;j<ar.length;j++)
		 {
			
		 System.out.println(ar[j]);
		 }
		   
		
		
		
		  
		
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
		System.out.printf("\n Grade     :%c",tot>200?'A':'B');
	}
	

}
