import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LinkedListGUI extends JFrame implements ActionListener
{
	JButton button1 = new JButton("Add Text");
	JButton button2 = new JButton("Remove Text");
	JButton button3 = new JButton("Search Text");
	JButton button4 = new JButton("Check is Empty?");
	JTextField text1 = new JTextField("Enter Add Text");
	JTextField text2 = new JTextField("Enter Remove Text");
	JTextField text3 = new JTextField("Enter Search Text");
	JLabel label = new JLabel (" Project Skill Work\n");
	JLabel label1 = new JLabel ("<html>Rules: No space allow when putting text,<br>Upper case will be sensitive in this program.</html>");
	JLabel label2 = new JLabel ("Text Display Area: ");
	JLabel label3 = new JLabel ("Example");
	int num = 0; String[] arr; 
	ListReferenceBased la = new ListReferenceBased();
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
		Font fbutton = new Font("Serif", Font.BOLD, 18);
		
		button4.setFont(fbutton);
		button4.setPreferredSize( new Dimension( 150, 24 ) );
		button4.addActionListener(this);
		p1.fill = GridBagConstraints.VERTICAL;
		p1.ipady = 20;
		p1.weightx = 0.5;
		p1.insets = new Insets(15,0,15,50);
		p1.gridx = 0;
		p1.gridy = 0;
		panel1.add(button4, p1);
		
		button1.setFont(fbutton);
		button1.setPreferredSize( new Dimension( 150, 24 ) );
		button1.addActionListener(this);
		p1.fill = GridBagConstraints.VERTICAL;
		p1.ipady = 20;
		p1.gridx = 0;
		p1.gridy = 3;
		panel1.add(button1, p1);
	
		button2.setFont(fbutton);
		button2.setPreferredSize( new Dimension( 150, 24 ) );
		button2.addActionListener(this);
		p1.fill = GridBagConstraints.VERTICAL;
		p1.ipady = 20;
		p1.gridx = 0;
		p1.gridy = 5;
		panel1.add(button2, p1);
	
		button3.setFont(fbutton);
		button3.setPreferredSize( new Dimension( 150, 24 ) );
		button3.addActionListener(this);
		p1.fill = GridBagConstraints.VERTICAL;
		p1.ipady = 20;
		p1.gridx = 0;
		p1.gridy = 7;
		panel1.add(button3, p1);
			
		label1.setFont(fbutton);
		label1.setPreferredSize( new Dimension( 400, 24 ) );
		p2.fill = GridBagConstraints.VERTICAL;
		p2.ipady = 20;
		p2.insets = new Insets(15,40,15,0);
		p2.gridx = 0;
		p2.gridy = 0;
		panel2.add(label1, p2);
		
		text1.setFont(fbutton);
		text1.setPreferredSize( new Dimension( 400, 24 ) );
		p2.fill = GridBagConstraints.VERTICAL;
		p2.ipady = 20;
		p2.gridx = 0;
		p2.gridy = 3;
		panel2.add(text1, p2);

		text2.setFont(fbutton);
		text2.setPreferredSize( new Dimension( 400, 24 ) );
		p2.fill = GridBagConstraints.VERTICAL;
		p2.ipady = 20;
		p1.weightx = 0;
		p2.gridx = 0;
		p2.gridy = 5;
		panel2.add(text2, p2);
	
		text3.setFont(fbutton);
		text3.setPreferredSize( new Dimension( 400, 24 ) );
		p2.fill = GridBagConstraints.VERTICAL;
		p2.ipady = 20;
		p2.gridx = 0;
		p2.gridy = 7;
		panel2.add(text3, p2);

		//create and add label to panel
		Font flabel = new Font("Serif", Font.ITALIC, 35);
		label.setFont(flabel);
		panel3.add(label);

		
		Font flabel2 = new Font("Serif", Font.ITALIC, 30);
		label2.setFont(flabel2);
		JPanel panel4 = new JPanel();
		panel4.add(label2);
		label3.setFont(flabel2);
		panel4.add(label3);
		
		cPane.add(new JLabel(" "), BorderLayout.NORTH);
		cPane.add(panel1, BorderLayout.EAST);
		cPane.add(panel2, BorderLayout.WEST);
		cPane.add(panel3, BorderLayout.NORTH);
		cPane.add(panel4, BorderLayout.SOUTH);
	}

	public static void main (String [] args)
	{
		JFrame frame = new LinkedListGUI();
		frame.setSize(800, 550);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	public void actionPerformed(ActionEvent e) 
	{
		
	}
}