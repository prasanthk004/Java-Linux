package tamilnadu.chennai;

public class primeNumber {
	
	public primeNumber(int num) {
		super();
		this.num = num;
	}

	int num ;
	
	void findPrime()
	{
		int n = 2 ;
		int flag=1;
		
		while(n<num)
		{
			if(num%n==0)
			{
				 flag=0;
				 break;
			}
			n++;
			
		}
		
		if(flag==1)
		{
			System.out.println(" Given Number is prime ");
		}
		else
		{
			System.out.println(" Given Number is not a prime number ");
		}
	}
	
	public static void main(String[] args) {
		primeNumber p=new primeNumber(10);
		p.findPrime();
		
	}

}
