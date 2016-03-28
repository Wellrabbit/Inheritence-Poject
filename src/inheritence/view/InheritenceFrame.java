package inheritence.view;

import inheritence.controller.InheritenceController;

import javax.swing.JFrame;

public class InheritenceFrame extends JFrame
{
private InheritenceController baseController;
private InheritencePanel basePanel;

public InheritenceFrame(InheritenceController baseController)
{
	this.baseController = baseController;
	basePanel = new InheritencePanel(baseController);
	setFrame();
}
private void setFrame()
{
	this.setContentPane(basePanel);
	 this.setTitle("Inheritence");
	 this.setResizable(false);
	 this.setSize(600,600);
	 this.setVisible(true);
}

public InheritenceController getBaseController()
{
	 return baseController;
}
}
