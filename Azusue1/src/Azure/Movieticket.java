package Azure;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Movieticket {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Movieticket window = new Movieticket();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Movieticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1035, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Movie Ticket");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(341, 45, 559, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(163, 157, 139, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Movie:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(163, 246, 119, 50);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tickets:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(163, 340, 95, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox c2 = new JComboBox();
		c2.setFont(new Font("Tahoma", Font.ITALIC, 16));
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		c2.setBounds(368, 350, 139, 21);
		frame.getContentPane().add(c2);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.ITALIC, 16));
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "AAAA", "BBBBB", "CCCCC"}));
		c1.setBounds(368, 265, 139, 21);
		frame.getContentPane().add(c1);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=t1.getText();
				String m=(String) c1.getSelectedItem();
				String t=(String)c2.getSelectedItem();
				int tickets=Integer.parseInt(t);
				int bill=0;
				if(m.equals("AAAA")) {
					bill=250*tickets;
					JOptionPane.showMessageDialog(btnNewButton,n+"\nSelected Movie"+m+"\ntickets are:"+t+"\nbill is:"+bill);
				}
				else if(m.equals("BBBBB")){
					bill=250*tickets;
					JOptionPane.showMessageDialog(btnNewButton,n+"\nSelected Movie"+m+"\ntickets are:"+t+"\nbill is:"+bill);
				}
				else if(m.equals("CCCCC")) {
					bill=250*tickets;
					JOptionPane.showMessageDialog(btnNewButton,n+"\nSelected Movie"+m+"\ntickets are:"+t+"\nbill is:"+bill);
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton,"Invalid");
				}
				}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 17));
		btnNewButton.setBounds(268, 430, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.ITALIC, 16));
		t1.setBounds(353, 177, 96, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
	}
}
