package inheritence.view;
import inheritence.controller.InheritenceController;

import javax.swing.*;

public class InheritencePanel extends JPanel
{
	private JButton paniniButton;
	private JButton pBandJButton;
	private JButton phillyCheeseSteak;
	private JTextArea diplayArea;
	private SpringLayout baseLayout;
	public InheritencePanel(InheritenceController baseController)
	{
		paniniButton = new JButton("Info Pannin");
		pBandJButton = new JButton("Info PB and J");
		phillyCheeseSteak = new JButton("Info Philly Cheese Steak");
		diplayArea = new JTextArea(10, 30);
		baseLayout = new SpringLayout();
		setupPanel();
		setupLayout();
		setupListeners();

	}
private void setupPanel()
{
	this.setLayout(baseLayout);
	this.add(paniniButton);
	this.add(pBandJButton);
	this.add(phillyCheeseSteak);
	this.add(diplayArea);
	
}
private void setupLayout()
{
	
}
private void setupListeners()
{
	
}


}
