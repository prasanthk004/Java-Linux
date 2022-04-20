package tamilnadu.chennai;

import java.util.Scanner;

public class ArrayLearn2 {
	
	public static void main(String[] args) {
		
		ArrayLearn2 a= new ArrayLearn2();
		//a.TwoDArray(); 
		//a.ThreeDArray();
		a.MatrixAdd();
		
	
	}	
	
	
	
	
	
	

	private void MatrixAdd() {
		// TODO Auto-generated method stub
		
		int [][]a= { {2,2},{3,2}};
		int [][]b= {{3,1},{3,4}};
		
		int i , j ; int [][]res = new int[a.length][a[0].length] ;
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				res[i][j]=a[i][j]+b[i][j];
				System.out.print(res[i][j]+" ");
			}
			
			System.out.println();
		}
	}







	private void ThreeDArray() {
		// TODO Auto-generated method stub
		int[][][]mark=new int[2][2][4] ;
		int[] total=new int[3];
		int i , j,k,tot=0;
		Scanner in = new Scanner(System.in);
		
		int[][] marks = new int[8][]; 
		//Jagged Array
		System.out.println(marks.length); 
		
		marks[0] = new int[5]; 
		marks[1] = new int[4]; 
		marks[2] = new int[8]; 
		System.out.println(marks[0].length);
		System.out.println(marks[1].length);
		System.out.println(marks[2].length);
		
		/*for(i=0;i<2;i++)
		{
			System.out.printf("\n Stud "+i+1);
			for(j=0;j<2;j++)
			{
				System.out.prin5tln("\n Exam "+j+1);				
				
				for(k=0;k<4;k++)
				{
					mark[i][j][k]=(int)Math.random()%99 ;
					System.out.printf("\n Mark %d : %d ",k+1,mark[i][j][k]);				
				}
			}
		}*/
		
	
	
	}







	private void TwoDArray() {
		// TODO Auto-generated method stub
		int[][]mark=new int[3][5] ;
		int[] total=new int[3];
		int i , j ,tot=0;
		Scanner in = new Scanner(System.in);
		
		
	
		for(i=0;i<3;i++)
		{
			
			for(j=0;j<5;j++)
			{
				System.out.printf("\n Exam %d ",i+1);
				System.out.printf("\n Mark %d :  ",j+1);
			mark[i][j]=in.nextInt();
				tot+=mark[i][j];
			
			}
			 
			System.out.println(tot);
			total[i]=tot;
			tot=0;
			
			
		
		}
		
	}
	
	
	

}
