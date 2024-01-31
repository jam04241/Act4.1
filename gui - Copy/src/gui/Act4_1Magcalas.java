package gui;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Act4_1Magcalas {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Act4.1_Magcalas");
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setSize(400,400); // x = length, y = height
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel namelabel = new JLabel("Name: ");
		namelabel.setBounds(50, 100, 100, 50); // x, y, length, height
		frame.add(namelabel);
		
		JLabel messagelabel = new JLabel();
		messagelabel.setBounds(50, 100, 500, 300); // x, y, length, height
		frame.add(messagelabel);
		
		JTextField text = new JTextField();
		text.setBounds(100, 100, 200, 40); // x, y, length, height
		frame.add(text);
		
		JButton button = new JButton("OK");
		button.setBounds(150, 160, 60, 50); // x, y, length, height
		frame.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = "[Welcome to JFrame ("+ text.getText() + ")]";
				
				messagelabel.setText(message);
			}
		});
	}

}
