package contoller;

import model.RecursionTool;
import view.RecursionFrame;

public class RecursionController
{
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	private String calculatedValue;
	
	public RecursionController()
	{
		mathTool = new RecursionTool();
		baseFrame = new RecursionFrame(this);
		calculatedValue = "";
	}
	
	public void start()
	{
		
	}
	
	public String doFibonacci(String input)
	{
		calculatedValue = "The Fibonacci sequence at " + input + " is " + Integer.toString(mathTool.fibonacciNumber(Integer.parseInt(input)));
		return calculatedValue;
	}
	
	public String doFactorial(String input)
	{
		calculatedValue = "The Fibonacci sequence at " + input + " is " + Integer.toString(mathTool.factorialNumber(Integer.parseInt(input)));
		return calculatedValue;
	}
	
}
