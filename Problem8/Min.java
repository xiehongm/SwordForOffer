package Problem8;

/**
 * Created by liujia on 14-8-27.
 */
public class Min {
	/*
	 * 输入递增排序数组的一个旋转，输出旋转数组的最小元素。
	 */
	public Integer minInReversingList(int[] array)
	{
		if(array==null)
			return null;
		int leftIndex=0;
		int rightIndex=array.length-1;
		int mid=0;//如果把排序数组的前面的0个元素搬到最后，那么就是array[0]
		while(array[leftIndex]>=array[rightIndex])
		{
			if(rightIndex-leftIndex<=1)
			{
				mid=rightIndex;
				break;
			}
			mid=(leftIndex+rightIndex)/2;
			/*if(array[leftIndex]==array[rightIndex] && array[leftIndex]==array[mid])
			{
				if(array[leftIndex+1]!=array[rightIndex-1])
				{
					mid=array[leftIndex+1]<array[rightIndex-1]?leftIndex+1:rightIndex-1;
					break;
				}
				else
				{
					leftIndex++;
					rightIndex--;
				}
					
			}*/
			if(array[leftIndex]==array[rightIndex] && array[leftIndex]==array[mid])
			{
				int result = array[leftIndex];
				for(int i = leftIndex + 1; i < rightIndex; i++){
					if(result > array[i])
						result = array[i];
				}
				return result;
			}
			else {
				if(array[mid]>=array[leftIndex])
					leftIndex=mid;
				else if(array[mid]<=array[rightIndex])
					rightIndex=mid;
			}					
		}
		return array[mid];	
	}
}
