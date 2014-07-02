package com.carvalho.util.gui;

import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * An external control panel. Part of a project fullfillment requirement to
 * demonstrate knowledge of Swing GUI
 * @author Lucas Carvalho
 *
 */

public class ControlPanelFrame extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public ControlPanelFrame() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		
		MainPanel frame=new MainPanel();
		
		
		
		setContentPane(frame);
		pack();
		
		setVisible(true);
	
	}

}
