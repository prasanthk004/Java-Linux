package tamilnadu.chennai;

public class ReverseNum {
	
	int num ;
	
	 
	
	public ReverseNum(int num) {
		super();
		this.num = num;
	}


	public void numRev()
	{
		 
		int add=0 ;
		int rem;
		int div=10;
		int num1;
		num1=num;
		
		while(num>0)
		{
			rem=num%10 ;
			add=add*10+rem;
			num/=10;
			//div/=10;
			
			
		}
		System.out.println(" Reversed : "+add);
		
		if(num1==add)
		{
		 System.out.println(" Given Number Is palindrome");
		}
		else
		{
			System.out.println(" Given Number Is not a palindrome");
		}
	}
	
	
	public void ArmstrongNum()
	{
	 
		
		int num1=num ;
		int rem ;
		int arm=0 ;
		
		while(num>0)
		{
			rem=num%10 ;
			arm+=rem*rem*rem;
			num/=10;
			
		}
		
	 System.out.println(arm);
	 
	 if(num1==arm)
	 {
		 System.out.println("Given Number is amstrong number");
		 
	 }
	 else 
	 {
		 System.out.println("Given Number is not a amstrong number");
	 }
	 
	 
	}
	
	public void fact()
	{
		int n = 5 ;
		int fact =1 ;
		int loop=1 ;
		
		while(loop<=n)
		{
			fact*=loop;
			System.out.printf(" \n %d   %d",loop,fact);
			loop++;
		}
			
		System.out.printf("\n\n\n Factorial of %d is %d",n,fact);
	}
	
	
	public void addMulofDigts()
	{
		int n=5 ;
		int sum=0 ,mul=1;
		int loop1=1;
		
		while(loop1<=n)
		{
			sum+=loop1;
			mul*=loop1;
			loop1++;		
			
		}
		
		System.out.printf(" Sum %d   Mul %d",sum,mul);
	}
	public static void main(String[] args )
	{
		ReverseNum r = new ReverseNum(100);
		r.numRev();
		//r.ArmstrongNum();
		//r.fact();
	 //r.addMulofDigts();
		
	}

}
