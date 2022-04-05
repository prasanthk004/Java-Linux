package tamilnadu.chennai;

public class pattern {
	
	public static void main(String[] args) {
		pattern p = new pattern();
		//p.numPattern();
		//p.Starpattern();
		
		//p.numPattern1();
		
		p.oddnum();
	}

	private void oddnum() {
		// TODO Auto-generated method stub
		int sum =1;
		for(int i=1 ; i<=10;i++)
		{
			System.out.print(sum+" ");
			sum+=i;
			
		}
	 
		
	}

	private void Starpattern() {
		// TODO Auto-generated method stub
		int n , row , col ;
		n=5 ;
		
		for(row=1;row<=n;row++)
		{
			 
			for(col=1;col<row;col++)
			{
				System.out.print("  ");
			}
			for(col=n;col>=row;col--)
			{
				if(col==row||col==n)
				{
					
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				
				}
				 
				
			}

			System.out.println();
		}
	}

	private void numPattern1() {
		// TODO Auto-generated method stub
		
	 int row , col ;
	 int n=5;
	 
	 for(row=1;row<=n;row++)
	 {
		 for(col=0;col<row;col++)
		 {
			 System.out.print(n-row-col+1+" ");
		 }
		 System.out.println();
	 }
	
	}
       // Patterns
	private void numPattern() {
		// TODO Auto-generated method stub
		
		int row , col ; 
		int n;
		
		n=4;
		for(row=1;row<=n;row++)
		{
			
			 for(col=0;col<row;col++)
			 {
				 
				 System.out.print(n+n-row-col+" ");
			 }
			 
			 System.out.println();
		}
		
	}
	

	


}
