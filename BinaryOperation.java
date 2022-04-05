package tamilnadu.chennai;

public class BinaryOperation {
	int bin;
	int decimal ;
	
 
	
	public BinaryOperation(int bin ) {
		super();
		this.bin = bin;
		 
	}
	public void BinarytoDecimal()
	{
		int rem;
		int binary=bin;
		int dec;
		int pow=0;
		while(binary>0)
		{
			rem=binary%10;
			
			dec=rem*power(2,pow);
			decimal+=dec;
			pow++;
			binary/=10;
					
		}
		
		System.out.printf("\n Decimal Value of %d is %d \n\n\n",bin,decimal );
	}
	
	
	public void DecimalToBinary(int d)
	{
		String binary="";
		int rem;
		int dec=d;
		while(dec>0)
		{
			rem=dec%2;
		   binary=rem+binary;
		  dec/=2;
		  
		  
		}
		System.out.printf("\n Binary value of %d is %s \n\n",d,binary);
	}
	
	int power(int n,int t)
	{
		int res=1;
		while(t>0)
		{
			res*=n;
			t--;
		}
		
		return res;
	}
	

	public static void main(String[] args) {
		
		BinaryOperation b= new BinaryOperation(1010);
		//b.BinarytoDecimal();
	 // System.out.println(b.power(3,3));
		b.DecimalToBinary(10);
		
	}
	
	

}
