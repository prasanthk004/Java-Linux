package tamilnadu.chennai;

 	
	public class PassportException extends RuntimeException {
		
		public void check_nationality(String nationality)  
		{
			if(nationality.equals("indian"))
			{
				System.out.println("You are eligible ");
			}
			else
			{
				PassportException pe = new PassportException(); 
				throw pe; 
			}
		}

	} 

 
