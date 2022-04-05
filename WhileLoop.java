package tamilnadu.chennai;
import java.util.*;
 public class WhileLoop {
	
	public static void main(String[] args)
	{
		WhileLoop wl=new WhileLoop();
		//wl.Loop_learn();
		//wl.Loop_learn2();
		//wl.Loop_learn3();
		wl.Loop_Input();
	}

 private void Loop_learn3() {
		// TODO Auto-generated method stub
	 int day=1;
	 long gold=1 ;
	 
	 while(gold> 0)
	 {
		 System.out.println("Day "+day+" Gold "+gold);
		 gold*=2 ;
		 day+=1;
		
	 }
	 
	 //System.out.println("Day "+day+" Gold "+gold);
		
	}

public void Loop_learn()
 {
	 int day=1;
	 int purse=0; 
	 
	 while(day<=30)
	 {
		purse+=day ;
		  
		 
		 System.out.println("DAY :"+day+"| Given Amount on Day "+day+" is "+day+"|  Amount in Purse :"+purse); 
			day+=1 ;
		
		 
	 }
	
 }
 
 public void Loop_learn2()
 {
	 int temple=0;
	 int flowers=64; 
	 System.out.println("Temple :"+temple+" Flowers in Hand "+flowers); 	 
	 while(flowers>1)
	 {
		  flowers/=2 ;
		  temple+=1 ;
		  
		  System.out.println("Temple :"+temple+" Flowers in Hand "+flowers); 	 
		  
		
		 
	 }
 
 }
 
 public void Loop_Input()
 {
	 int mark  ; 
	 int total=0 ;
	 
	 int no,n=1; 
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the No of Subject : ");
	 no=sc.nextInt();
	 while(n<=no)
	 {
		 System.out.print("Enter Mark "+n+" :");
		 mark=sc.nextInt();
		 total+=mark ;
		 n++;
	 }
	 
	 System.out.println("Total Marks  : "+total);
	 
 }
 
}
