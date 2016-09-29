package Problem20;

public class PrintMatrixInCircle {
	/*
	 * 顺时针打印矩阵
	 */
	public void printMatrixInCircle(int[][] array)
	{
		if(array==null)
			return ;
		int start=0;
		while(array[0].length>start*2 && array.length>start*2)
		{
			printOneCircle(array,start);
			start++;
		}
	}
	private void printOneCircle(int[][] array,int start)
	{
		 for(int i=start;i<array[0].length-start;i++)
		 {
			 System.out.println(array[start][i]);
		 }
		 if(array.length-1-start>start)
		 {
			 for(int i=start+1;i<array.length-start;i++)
			 {
				 System.out.println(array[i][array[0].length-1-start]);
			 }
		 }
		 if(array[0].length-start-1>start && array.length-start-1>start)
		 {
			 for(int i=array.length-start-1;i>start;i--)
			 {
				 System.out.println(array[array.length-start-1][i]);
			 }
		 }
		 if(array.length-1-start>start && array[0].length-1-start>start)
		 {
			 for(int i=array.length-start-1;i>start;i--)
			 {
				 System.out.println(array[i][start]);
			 }
		 }
		 
	}
}


public void printCircle(int[][] matrix, int startX, int startY, int endX, int endY) {  
    // only one column left  
    if (startY == endY) {  
        for (int i = startX; i <= endX; i++ ) {  
            System.out.println(matrix[i][endY]);  
        }  
        return;  
    }  
    // only one row left  
    if (startX == endX) {  
        for (int i = startY; i <= endY; i++ ) {  
            System.out.println(matrix[startX][i]);  
        }  
        return;  
    }  
    for (int i = startY; i < endY; i++ ) {  
        System.out.println(matrix[startX][i]);  
    }  
    for (int i = startX; i < endX; i++ ) {  
        System.out.println(matrix[i][endY]);  
    }  
    for (int i = endY; i > startY; i-- ) {  
        System.out.println(matrix[endX][i]);  
    }  
    for (int i = endX; i > startX; i-- ) {  
        System.out.println(matrix[i][startY]);  
    }  
  
}  
      
public void printMatrix(int[][] matrix) {  
      
    if (matrix == null) {  
        return;  
    }  
    int startX = 0;  
    int startY = 0;  
    int endY = matrix[0].length - 1;  
    int endX = matrix.length - 1;  
      
    while ((startX <= endX) && (startY <= endY)) {  
        printCircle(matrix, startX, startY, endX, endY);  
        startX++;  
        startY++;  
        endX--;  
        endY--;  
    }  
}  
