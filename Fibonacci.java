package tamilnadu.chennai;

public class Fibonacci {
	
	int f1 , f2 , f3 ;
	
	
	public Fibonacci()
	{
		f1=-1 ; f2=1 ; f3=0 ;	
	}
	
	
	
	public void Fibo()
	{
     
		
		while(f2<50)
		{
			System.out.println(f3);
			f3=f1+f2 ;
			f1=f2;
			f2=f3;
			
			
		}
		
	}
	public void findFibo(int n)
	{
		int flag=0;
	
		while(f3<n)
		{
			f3=f1+f2;
		
			f1=f2;
			f2=f3;
			System.out.println(f2);
			
			if(f2==n)
			{
				flag=1;
				break;
			}
			
			
		
		
			
		}
		
		if(flag==1)
		{
			System.out.println(" Given Number is fiboNacci number");
		}
		else
		{
			System.out.println(" Given Number is not fiboNacci number");
			
		}
	}
	
	public static void main(String [] args)
	{
		Fibonacci fn= new Fibonacci();
		//fn.Fibo();
		fn.findFibo(13);
		
	}

}
