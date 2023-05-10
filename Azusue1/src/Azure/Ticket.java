package Azure;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ticket {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket window = new Ticket();
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
	public Ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1017, 613);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(424, 23, 174, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(99, 121, 103, 57);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("From:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(99, 201, 135, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("To:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(102, 285, 80, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tickets:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(99, 346, 103, 38);
		frame.getContentPane().add(lblNewLabel_4);
		
		t1 = new JTextField();
		t1.setBackground(Color.PINK);
		t1.setBounds(263, 144, 167, 34);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setBackground(Color.LIGHT_GRAY);
		c1.setFont(new Font("Tahoma", Font.ITALIC, 16));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Hyd", "Mbnr", "Wnp", "Knl"}));
		c1.setBounds(263, 214, 176, 21);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setFont(new Font("Tahoma", Font.ITALIC, 16));
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Wnp", "Hyd", "Knl", "Mbnr"}));
		c2.setBounds(263, 291, 176, 21);
		frame.getContentPane().add(c2);
		
		JComboBox t2 = new JComboBox();
		t2.setBackground(Color.LIGHT_GRAY);
		t2.setFont(new Font("Tahoma", Font.ITALIC, 16));
		t2.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		t2.setBounds(268, 357, 181, 21);
		frame.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=t1.getText();
				String fs=(String) c1.getSelectedItem();
				String ts=(String) c2.getSelectedItem();
				String t=(String) t2.getSelectedItem();
				int ticket=Integer.parseInt(t);
				int bill=0;
				if(fs=="Hyd" && ts=="Hyd") {
					JOptionPane.showMessageDialog(btnNewButton,"Check it is Invalid");
				}
				else if(fs=="Hyd" && ts=="Mbnr")
				{
					bill=ticket*30;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+"\nfrom: "+fs+"\nto: "+ts+"\ntickets: "+t+"\nbill: "+bill);
				}
				else if(fs=="Hyd" && ts=="Wnp")
				{
					bill=ticket*200;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+"\nfrom: "+fs+"\nto: "+ts+"\ntickets: "+t+"\nbill: "+bill);
				}
				else if(fs=="Hyd" && ts=="Knl")
				{
					bill=ticket*40;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+"\nfrom: "+fs+"\nto: "+ts+"\ntickets: "+t+"\nbill: "+bill);
				}
				if(fs=="Mbnr" && ts=="Mbnr") {
					JOptionPane.showMessageDialog(btnNewButton,"Check it is Invalid");
				}
				else if(fs=="Mbnr" && ts=="Hyd")
				{
					bill=ticket*30;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+"\nfrom: "+fs+"\nto: "+ts+"\ntickets: "+t+"\nbill: "+bill);
				}
				else if(fs=="Mbnr" && ts=="Wnp")
				{
					bill=ticket*200;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+"\nfrom: "+fs+"\nto: "+ts+"\ntickets: "+t+"\nbill: "+bill);
				}
				else if(fs=="Mbnr" && ts=="Knl")
				{
					bill=ticket*40;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+"\nfrom: "+fs+"\nto: "+ts+"\ntickets: "+t+"\nbill: "+bill);
				}
				if(fs=="Wnp" && ts=="Wnp") {
					JOptionPane.showMessageDialog(btnNewButton,"Check it is Invalid");
				}
				else if(fs=="Wnp" && ts=="Mbnr")
				{
					bill=ticket*30;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+"\nfrom: "+fs+"\nto: "+ts+"\ntickets: "+t+"\nbill: "+bill);
				}
				else if(fs=="Wnp" && ts=="Hyd")
				{
					bill=ticket*200;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+"\nfrom: "+fs+"\nto: "+ts+"\ntickets: "+t+"\nbill: "+bill);
				}
				else if(fs=="Wnp" && ts=="Knl")
				{
					bill=ticket*40;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+"\nfrom: "+fs+"\nto: "+ts+"\ntickets: "+t+"\nbill: "+bill);
				}
				if(fs=="Knl" && ts=="Knl") {
					JOptionPane.showMessageDialog(btnNewButton,"Check it is Invalid");
				}
				else if(fs=="Knl" && ts=="Mbnr")
				{
					bill=ticket*30;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+"\nfrom: "+fs+"\nto: "+ts+"\ntickets: "+t+"\nbill: "+bill);
				}
				else if(fs=="Knl" && ts=="Wnp")
				{
					bill=ticket*200;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+"\nfrom: "+fs+"\nto: "+ts+"\ntickets: "+t+"\nbill: "+bill);
				}
				else if(fs=="Knl" && ts=="Hyd")
				{
					bill=ticket*40;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+"\nfrom: "+fs+"\nto: "+ts+"\ntickets: "+t+"\nbill: "+bill);
				}
				//else {
					//JOptionPane.showMessageDialog(btnNewButton,"Select sation");
				//}
			}
		});
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(181, 447, 181, 39);
		frame.getContentPane().add(btnNewButton);
	}
}
