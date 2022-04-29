package tamilnadu.chennai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLearn {
	
	public static void main(String[] args) {
		
		//Test1();
		
		Test();
	}

	private static void Test1() {
		// TODO Auto-generated method stub

		String input = "xyz xy xy xyz xyz xx yyzz"; 
		Pattern pattern = Pattern.compile("xyz"); //regular expression
		Matcher	m	= pattern.matcher(input);
		while(m.find())
		{
			System.out.println(m.group());
			System.out.println(m.start());
		} 
	}

	private static void Test() {
		// TODO Auto-generated method stub
		String input = "079080973655"; 
		Pattern pattern = Pattern.compile("(0|95)?[5-9][0-9]{9}");  
		Matcher	m	= pattern.matcher(input);
	 
		
		  if(m.find()) 
		  { 
			  System.out.println(m.group() + " is present at "+ m.start());

		  } 
		  else
		  {
			  System.out.println(" Unable to find the number");
		  }
	}

}
