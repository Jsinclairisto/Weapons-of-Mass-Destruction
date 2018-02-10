package Main;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JScrollBar;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

public class NukeProject extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private String address;
	private JLabel label;
	public static void main(String[]args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new NukeProject();
			}
		});
	}
	
	public NukeProject() {
		getContentPane().setLayout(null);
		pack();
		setTitle("Uranium Ware");
		setResizable(false);
		setSize(470,230);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 278);
		getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the address/coordinates you would like to nuke");
		lblNewLabel_1.setFont(new Font("Silom", Font.PLAIN, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				String input = textField.getText();
				JOptionPane.showMessageDialog(null, "CONGRATULATIONS! YOU'VE JUST NUKED " + input);
				
				
			}
			
		}); 
		
		JButton btnNewButton = new JButton("Launch Nukes");
		btnNewButton.setIcon(new ImageIcon("/Users/jakobfletcher/Downloads/icon.png"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(104)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(106, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(46, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addGap(23))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(143)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(144, Short.MAX_VALUE))
				
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(32)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(102, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}



}
