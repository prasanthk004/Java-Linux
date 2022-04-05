package tamilnadu.chennai;

public class SqrRoot {
	
	int num ;
	
	public void findSqrt()
	{
		int sqr=1 ;
		
		while(sqr<num)
		{
			if(num/sqr==sqr)
			{
				System.out.printf("\n Square root of %d is %d ",num,sqr);
				break;
			}
			sqr++;
		}
		
		
	
	}
	
	
	public static void main(String[] args) {
		
		SqrRoot s=new SqrRoot(4);
		s.findSqrt();
		
	}


	public SqrRoot(int num) {
		super();
		this.num = num;
	}

 
}
