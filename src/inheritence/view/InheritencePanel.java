package inheritence.view;
import javax.swing.*;

public class InheritencePanel extends JPanel
{
	private JButton paniniButton;
	private JButton pBandJButton;
	private JButton phillyCheeseSteak;
	private JTextArea diplayArea;
	
	InheritencePanel()
	{
		paniniButton = new JButton("Info Pannin");
		pBandJButton = new JButton("Info PB and J");
		phillyCheeseSteak = new JButton("Info Philly Cheese Steak");
		diplayArea = new JTextArea(10, 30);
	}
}
