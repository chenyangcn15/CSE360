import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Team extends JPanel
{
	//public int x,y;
	private JTextField p1, p2, p3, p4;
	private JButton sumButton;
	private JLabel sumLabel;
	
	public Team(int x, int y)
	{
		setBackground(Color.PINK);
		setSize(x,y);
		setLayout(new FlowLayout());
		
		p1 = new JTextField("Chen Yang");
		p2 = new JTextField("Haoyu Xu");
		p3 = new JTextField("Sarah Goddard");
		p4 = new JTextField("Pemma Reitar");
		sumButton = new JButton("Sum");
		sumLabel = new JLabel();
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(sumButton);
		add(sumLabel);
		
		ButtonListener listener = new ButtonListener();
		sumButton.addActionListener(listener);
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			sumLabel.setText("We Are Team7!");
		}
	}
}
