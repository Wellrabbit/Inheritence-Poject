package inheritence.controller;

import inheritence.view.InheritenceFrame;

public class InheritenceController
{
	
	private InheritenceFrame baseFrame;
	private InheritenceController baseController;
	
	
	public InheritenceController()
	{
		baseFrame = new InheritenceFrame(this);
		this.baseController = baseController;
	}
 public void start()
 {
	 
 }
}
