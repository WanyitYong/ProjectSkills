import javax.swing.*;
import java.awt.*;

public class LinkedListGUI extends JFrame
{
	public LinkedListGUI()
	{
		super("ATM Machine Layout");

		//create content pane
		Container cPane = getContentPane();

		//create panel
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		//set grid bag layout for panel 1 and 2
		panel1.setLayout(new GridBagLayout());
		panel2.setLayout(new GridBagLayout());
		GridBagConstraints p1 = new GridBagConstraints();
		GridBagConstraints p2 = new GridBagConstraints();

		//create button
		Font fbutton = new Font("Serif", Font.BOLD, 15);
		JButton button1 = new JButton("BALANCE INQUIRY");
			button1.setFont(fbutton);
			p1.fill = GridBagConstraints.VERTICAL;
			p1.ipady = 20;
			p1.weightx = 0.5;
			p1.insets = new Insets(15,40,15,0);
			p1.gridx = 0;
			p1.gridy = 0;
			panel1.add(button1, p1);
		JButton button3 = new JButton(" MINI STATEMENT ");
			button3.setFont(fbutton);
			p1.fill = GridBagConstraints.VERTICAL;
			p1.ipady = 20;
			p1.gridx = 0;
			p1.gridy = 3;
			panel1.add(button3, p1);
		JButton button5 = new JButton("    PIN CHANGE       ");
			button5.setFont(fbutton);
			p1.fill = GridBagConstraints.VERTICAL;
			p1.ipady = 20;
			p1.gridx = 0;
			p1.gridy = 5;
			panel1.add(button5, p1);
			
		JTextField button2 = new JTextField("	Enter Add Text	");
			button2.setFont(fbutton);
			p2.fill = GridBagConstraints.VERTICAL;
			p2.ipady = 20;
			p2.insets = new Insets(15,0,15,40);
			p2.gridx = 0;
			p2.gridy = 5;
			panel2.add(button2, p2);
		JTextField button4 = new JTextField("	Enter Remove Text	");
			button4.setFont(fbutton);
			p2.fill = GridBagConstraints.VERTICAL;
			p2.ipady = 20;
			p1.weightx = 0;
			p2.gridx = 0;
			p2.gridy = 3;
			panel2.add(button4, p2);
		JTextField button6 = new JTextField("	Enter Search Text	");
			button6.setFont(fbutton);
			p2.fill = GridBagConstraints.VERTICAL;
			p2.ipady = 20;
			p2.gridx = 0;
			p2.gridy = 0;
			panel2.add(button6, p2);

		//create and add label to panel
		JLabel label = new JLabel (" Project Skill Work\n");
			Font flabel = new Font("Serif", Font.ITALIC, 35);
			label.setFont(flabel);
			panel3.add(label);

		JLabel label2 = new JLabel ("Text Display Area:");
			Font flabel2 = new Font("Serif", Font.ITALIC, 30);
			label2.setFont(flabel2);
		cPane.add(new JLabel(" "), BorderLayout.NORTH);
		cPane.add(panel1, BorderLayout.WEST);
		cPane.add(panel2, BorderLayout.EAST);
		cPane.add(panel3, BorderLayout.CENTER);
		cPane.add(label2, BorderLayout.SOUTH);
	}

	public static void main (String [] args)
	{
		JFrame frame = new LinkedListGUI();
		frame.setSize(1200, 800);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}