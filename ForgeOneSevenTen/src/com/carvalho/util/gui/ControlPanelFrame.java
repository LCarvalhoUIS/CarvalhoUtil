/** Carvalho Util
 * @author Lucas Carvalho
 * @version 1.2
 * 
 */

package com.carvalho.util.gui;

import javax.swing.JFrame;

/**
 * An external control panel. Part of a project fullfillment requirement to
 * demonstrate knowledge of Swing GUI
 * @author Lucas Carvalho
 *
 */

@SuppressWarnings("serial")
public class ControlPanelFrame extends JFrame {

	



	/**
	 * Create the frame.
	 */
	public ControlPanelFrame() {
		//Hides, does not stop the program itself
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		
	
		MainPanel panel=new MainPanel();
		
		
		
		setContentPane(panel);
		pack();
		
		setVisible(true);
	
	}

}
