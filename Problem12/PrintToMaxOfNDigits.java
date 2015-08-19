package Problem12;

public class PrintToMaxOfNDigits {
	/*
	 * 输入数字n,按顺序打印出从1最大的n位十进制数
	 */

	public void printToMaxOfNDigits(int n)
	{
		int[] array=new int[n];
		if(n<=0)
			return;
		printArray(array, 0);	
	}
	private void printArray(int[] array,int n)
	{
		for(int i=0;i<10;i++)//这里的10代表的是每一位上0~9。
		{
			if(n!=array.length)
			{
				array[n]=i;
		        printArray(array, n+1);;
			}
			else 
			{
				boolean isFirstNo0=false;
				for(int j=0;j<array.length;j++)
				{
					if(array[j]!=0)
					{
						System.out.print(array[j]);
						if(!isFirstNo0)			
							isFirstNo0=true;					
					}
					else
					{
						if(isFirstNo0)
							System.out.print(array[j]);
					}
				}	
				System.out.print("\n");
				return ;
			}
		}
	}

}
