package tamilnadu.chennai;

public class SpiralMatrix {
	
	public static void main(String[] args) {
		SpiralMatrix sp = new SpiralMatrix();
		sp.PrintSpiral();
	}

	private void PrintSpiral() {
		// TODO Auto-generated method stub
		int[][] spiral = new int[4][4]; 
		int value = 1; int maxRow=3; 
		int col ;
		
		int minRow=0; int maxCol=3; int minCol=0; 
		
		while(value<=16)
		{
			
		for( col=minCol;col<=maxCol; col++)
		{
		spiral[minRow][col] = value; 
		value++; 
		} 
		
		for(int row=minRow+1; row<=maxRow; row++)
		{
		spiral[row][maxCol] = value; 
		value++;
		}
		
		for(  col=maxCol-1;col>=minCol;col--)
		{
		spiral[maxRow][col] = value; value++;
		}
		
		for(int row=maxRow-1;row>=minRow+1;row--)
		{
		spiral[row][minCol] = value; value++; 
		}
		maxRow--; 
		minRow++; maxCol--; minCol++;
		} 
		
		
		
	for(int row=0; row<=3; row++)
	{
	for(  col=0; col<=3; col++)
	{
	System.out.printf(" %2d",spiral[row][col]); 
	}
	System.out.println(); 
	} 
	
    }
		
 
}
