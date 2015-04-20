import java.awt.Color; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JTextField; 
import javax.swing.JButton;

public class BasicGui implements ActionListener {
private JFrame frame;
private JPanel panel;
private JLabel label;
private JLabel output;
public JTextField textfield1;
public JTextField textfield2;
private JButton button;

public BasicGui () {
	frame = new JFrame();
	frame = new JFrame("Calculator");
	frame.setVisible(true);
	frame.setSize(300, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	panel = new JPanel();
	panel.setBackground(Color.RED);
	
	label = new JLabel();
	label.setText("Enter a number");
	output = new JLabel();
	output.setText("---");
	
	textfield1 = new JTextField("Enter a number",20);
	textfield2 = new JTextField(20);
	
	button = new JButton("Calculate");
	button.addActionListener(this);
	
	panel.add(label);
	panel.add(textfield1);
	panel.add(textfield2);
	frame.add(panel);
	panel.add(button);
	frame.add(panel);
	panel.add(output);
}

public void actionPerformed(ActionEvent e) {
	double num1 = Double.parseDouble(textfield1.getText());
	double num2 = Double.parseDouble(textfield2.getText());
	double sum = num1+num2;
	output.setText(String.valueOf(sum));
	
}
}
