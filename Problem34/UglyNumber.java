package Problem34;

public int getUglyNumber_Solution2(int index){  
        if(index <0)  
            return 0;  
        int[] uglyArray = new int[index];  
        uglyArray[0] = 1;  
        int multiply2 = 0;  
        int multiply3 = 0;  
        int multiply5 = 0;  
        for(int i = 1;i<index;i++){  
            int min = min(uglyArray[multiply2]*2,uglyArray[multiply3]*3,uglyArray[multiply5]*5);  
            uglyArray[i] = min;  
            while(uglyArray[multiply2]*2 == uglyArray[i])  
                multiply2++;  
            while(uglyArray[multiply3]*3 == uglyArray[i])  
                multiply3++;  
            while(uglyArray[multiply5]*5 == uglyArray[i])  
                multiply5++;  
        }  
        return uglyArray[index-1];  
    }  
    public int min(int number1,int number2,int number3){  
        int min = (number1<number2)?number1:number2;  
        return min <number3?min:number3;  
    }  

/*public class UglyNumber {
	/*
	 * 只包含因子2,3,5的数为丑数，1是第一个丑数，求从小到大的第1500个丑数
	 */
	public int getUglyNumber(int n)
	{
		if(n<0)
			return 0;
		int[] uglyArray=new int[n];
		uglyArray[0]=1;
		int multiply2=1;
		int multiply3=1;
		int multiply5=1;
		for(int i=1;i<uglyArray.length;i++)
		{
			int min=Min(multiply2*2,multiply3*3,multiply5*5);
			uglyArray[i]=min;
			while(multiply2*2<=min)
				multiply2++;
			while(multiply3*3<=min)
				multiply3++;
			while(multiply5*5<=min)
				multiply5++;
		}
		return uglyArray[n-1];
	}
	int Min(int number1,int number2,int number3)
	{
		int min=(number1<number2)?number1:number2;
		return min<number3?min:number3;
	}

}*/
