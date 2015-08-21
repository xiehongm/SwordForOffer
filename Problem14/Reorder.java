package Problem14;

public class Reorder {
	/*
	 * 输入一个整数数组，实现一个函数来调整数组中的数字的顺序，使得所有奇数位于数组的前半部分，偶数位于后半部分
	 */
	public void order(int[] array)
	{
		if(array==null)
			return ;
		int i = 0;
		int j = array.length - 1;
		while(i < j){
			if(isEven(array[i]) && !isEven(array[j])){
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}else if(!isEven(array[i]) && !isEven(array[j])){
				i++;
			}else if(isEven(array[i]) && isEven(array[j])){
				j--;
			}else{
				i++;
				j--;
			}
		}
	}
	private boolean isEven(int n)
	{
		return n%2==0;
	}

}
