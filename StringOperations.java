package tamilnadu.chennai;

public class StringOperations {

	public static void main(String[] args) {
		StringOperations s= new StringOperations();
		//s.chars();
		s.FindCharFreq();
		
	/* c= new String("KP");
        String d= new String("hi");
        System.out.println(c==d);
        String h="hi";
        String g="hi";
        System.out.println(h==g);
        
        System.out.println(" c "+c.hashCode());
        System.out.println(" d "+d.hashCode());	
        
        System.out.println(" h "+h.hashCode());
        System.out.println(" G "+g.hashCode());
        System.out.println("hi".hashCode());*/
		
	}

	private void FindCharFreq() {
		// TODO Auto-generated method stub
		String name = "vinodhini"; 
		int len = name.length(); 
		int[] freq = new int[len]; 
		int j =0; 
		while(j<name.length())
		{
		char key = name.charAt(j); 
		int count = 1;
		for(int i=j+1; i<name.length(); i++)
		{
		if(key ==name.charAt(i))
			{
			count++; 
			freq[i] = -5; 
			}
		}
		
//System.out.println(key+ " appears " + count + " times"); 

		if(freq[j]!=-5)
		freq[j]= count; 
		j++; 
		}
		for(int i=0;i<freq.length;i++)
		{
	    if(freq[i]!=-5)
	System.out.println(name.charAt(i) + "--> "+freq[i]);
		} 
	}

	private void chars() {
		// TODO Auto-generated method stub
		String s="PRasanth K";
		
		for(int i=0 ; i<s.length() ;i++)
		{
			 char ch =s.charAt(i);
			 
			 if(ch>='A'&&ch<='Z')
			 {
				 ch+=32;
		       System.out.printf("%c",(char)(s.charAt(i)+32));
				
			 }
			 else
			 {
			      System.out.printf("%c",s.charAt(i));
			 }
		}
	}
	
	
	
}
