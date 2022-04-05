package tamilnadu.chennai;

public class learnFor {
	
	
	
 public static void main(String[] args) {
	 learnFor f= new learnFor();
	// f.nestedFor();
	// f.nestedFor1();
	// f.nestedFor2();
	 System.out.println();
	 System.out.println();
	 //f.numPattern();
	 //f.starPattern();
	 f.starPattern1();
}
 
 

private void starPattern1() {
	// TODO Auto-generated method stub
	int row , col ;
	for(row=1;row<=10;row++)
	{
		
		if(row==1||row==5||row==10)
		{
		for(col=1;col<=7;col++)
		{
			System.out.print("* ");
			
		}
		}
		else
		{
 
			 
		 for(col=1;col<=7;col++)
		 {
			if(row<=4)
			{
				 if(col==1||col==7)
				 {
					 System.out.print("* ");
				 }
				 else
				 {
					 System.out.print("  ");
				 }
			}
			 if(col==1||col==7)
			 {
				 System.out.print("* ");
			 }
			 else
			 {
				 System.out.print("  ");
			 }
		 }
		  
			
		}
		System.out.println();
		
	}

	
}



private void starPattern() {
	// TODO Auto-generated method stub
	int row,col;
	for (row=1;row<=5;row++)
	{
	 
		for(col=1;col<row;col++)
		{
			System.out.print("  ");
			
			
		}
		
		 for(col=1;col<=5-row+1;col++)
		{
			System.out.print("* ");
			
		} 
		
		System.out.println();
	}
}



private void numPattern() {
	// TODO Auto-generated method stub
	int col , row ,val,n;
	
	n=5;
	
	for(row=n;row>=1;row--)		
	{
		
	/*	for(col=1;col<=n-row;col++)
		{
			System.out.print(" ");
		}*/
		for(col=0;col<row;col++)
		{
			System.out.print(col+row+" ");
		}
		System.out.println();
	}
	
 
	System.out.println();
	
	/*for(  val=1,row=5;row>=1;row--,val++)
	{
		for(col=1;col<=row;col++)
		{
			System.out.print(row%col+" ");
		}
		System.out.println();
	}*/
	
}



private void nestedFor1() {
	// TODO Auto-generated method stub
	int no=0;
	int i ;
	for(no=1;no<=5;no++)
	{
		for(i=5;i>=1;i--)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
	}
}
private void nestedFor2() {
	// TODO Auto-generated method stub
	int no=0;
	int i ;
	for(no=3;no>=1;no--)
	{
		for(i=1;i<=5;i++)
		{
			System.out.print(no+" ");
			
		}
		System.out.println();
	}
}
 

private void nestedFor() {
	// TODO Auto-generated method stub
	int no=0;
	int i ;
	for(no=1;no<=5;no++)
	{
		for(i=1;i<=5;i++)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
	}
}

}
