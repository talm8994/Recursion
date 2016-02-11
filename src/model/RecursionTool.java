package model;

public class RecursionTool
{
	
	public int fibonacciNumber(int position)
	{
		//boun check
		if(position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		//bace case
		if(position == 0 || position == 1)
		{
			return 1;
		}
		else
		{
			return fibonacciNumber(position -1) + fibonacciNumber(position - 2);
		}
	}
}
