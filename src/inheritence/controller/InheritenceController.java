package inheritence.controller;

import inheritence.view.InheritenceFrame;

public class InheritenceController
{
	
	private InheritenceFrame baseFrame;
	
	
	
	public InheritenceController()
	{
		baseFrame = new InheritenceFrame(this);
		
	}
 
public void start()
 {
	 
 }

public InheritenceFrame getBaseFrame()
{
	return baseFrame;
}
public void setBaseFrame(InheritenceFrame baseFrame)
{
	this.baseFrame = baseFrame;
}
}
