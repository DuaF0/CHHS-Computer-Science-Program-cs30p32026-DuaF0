/*

Program: Roll.java          Last Date of this Revision: Feb 17, 2026

Purpose: Simulates rolling two dice and displays their faces randomly on a GUI when the user clicks a button.

Author: Dua Fatima, 
School: CHHS
Course: Computer Programming 3010
 

*/

package SkillBuilders;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class Roll
{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Roll window = new Roll();
					window.frame.setVisible(true);
				} 
				
					catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Roll() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		ImageIcon d1 = new ImageIcon(getClass().getResource("/SkillBuilders/images/die1.gif"));
		ImageIcon d2 = new ImageIcon(getClass().getResource("/SkillBuilders/images/die2.gif"));
		ImageIcon d3 = new ImageIcon(getClass().getResource("/SkillBuilders/images/die3.gif"));
		ImageIcon d4 = new ImageIcon(getClass().getResource("/SkillBuilders/images/die4.gif"));
		ImageIcon d5 = new ImageIcon(getClass().getResource("/SkillBuilders/images/die5.gif"));
		ImageIcon d6 = new ImageIcon(getClass().getResource("/SkillBuilders/images/die6.gif"));
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 218, 245));
		frame.setBounds(100, 100, 425, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 218, 245));
		panel.setBounds(6, 6, 413, 387);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel dieFace = new JLabel("");
		dieFace.setBackground(new Color(211, 216, 207));
		dieFace.setBounds(65, 182, 137, 113);
		panel.add(dieFace);
		
		JLabel dieFace2 = new JLabel("");
		dieFace2.setBounds(270, 182, 137, 113);
		panel.add(dieFace2);
		
		JButton btnNewButton = new JButton("Roll Die");
		btnNewButton.setForeground(new Color(216, 161, 188));
		btnNewButton.setBackground(new Color(216, 142, 183));
		btnNewButton.setFont(new Font("Chalkduster", Font.PLAIN, 23));
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int newRoll, newRoll2;
				
				newRoll = (int)(6 * Math.random() + 1);
				
				if(newRoll == 1)
				{
					dieFace.setIcon(d1);
				}
				else if(newRoll == 2)
				{
					dieFace.setIcon(d2);
				}
				else if(newRoll == 3)
				{
					dieFace.setIcon(d3);
				}
				else if(newRoll == 4)
				{
					dieFace.setIcon(d4);
				}
				else if(newRoll == 5)
				{
					dieFace.setIcon(d5);
				}
				else if(newRoll == 6)
				{
					dieFace.setIcon(d6);
				}
				
				newRoll2 = (int)(6 * Math.random() + 1);
				
				if(newRoll2 == 1)
				{
					dieFace2.setIcon(d1);
				}
				else if(newRoll2 == 2)
				{
					dieFace2.setIcon(d2);
				}
				else if(newRoll2 == 3)
				{
					dieFace.setIcon(d3);
				}
				else if(newRoll == 4)
				{
					dieFace2.setIcon(d4);
				}
				else if(newRoll2 == 5)
				{
					dieFace2.setIcon(d5);
				}
				else if(newRoll2 == 6)
				{
					dieFace2.setIcon(d6);
				}
				
				
			}
		});
		btnNewButton.setBounds(32, 30, 350, 148);
		panel.add(btnNewButton);
		
		
	}

}
