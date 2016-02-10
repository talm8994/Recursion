package contoller;

import view.RecursionFrame;

public class RecursionController
{
private RecursionFrame baseFrame;
	
	public RecursionController()
	{
		
	}
	
	public void start()
	{
		baseFrame = new RecursionFrame(this);
	}
}
