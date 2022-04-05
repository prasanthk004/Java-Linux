package tamilnadu.chennai;



public class IFLEARN {
	
	int age ;
	
	
	public static void main(String[] args)
	{
		IFLEARN s = new IFLEARN();
		//s.Learnif();
		s.LearnIF2();
		
	}
	
	public void LearnIF2()
	{
		int amount =  140 ;
		int petrolPrice=100 ;
		
		
		
		if(amount>100) 
		{
			
			if(petrolPrice==104)
			{
				System.out.println("FILL PETROL"); 
			}
			else
			{
			 System.out.println("FILL HALF LITER PETROL");
			}
				
		}
		else
		{
			 System.out.println("Dont Have Enough Amount");
		}
		
	}
	
	
	private void Learnif()
	{
		boolean school=false ;
		boolean rain = false ;		
		String month = "MAR";
	
		
		if(month=="OCT")
		{
			System.out.println("EXAM TIME "); 
		}
		
		if(school&&rain)
		{
			System.out.println("Rain  Expected take umberlla  "); 
		}
		else if(school==true)
		{
			System.out.println(" GoTO school "); 
		}
		else
		{
			System.out.println(" Leave Take rest  "); 
		}
			
			
	}

}
