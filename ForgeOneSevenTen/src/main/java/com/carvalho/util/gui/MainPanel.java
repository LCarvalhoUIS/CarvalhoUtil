/** Carvalho Util
 * @author Lucas Carvalho
 * @version 1.2
 * 
 */
package com.carvalho.util.gui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;


/**
 * Primary JPanel of the frame.
 * @author Lucas Carvalho
 *
 */
@SuppressWarnings("serial")
public class MainPanel extends JPanel {

	
	
	/**
	 * Holds the category labels.
	 */
	private ArrayList<JPanel> categories;

	
	/**
	 * Create the frame.
	 */
	public MainPanel() {
	
		categories=new ArrayList<JPanel>();
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		setBorder(BorderFactory.createMatteBorder(5,5,5,5,java.awt.Color.white));
		
		try {
			//Opens the file with the labels
			BufferedReader reader=new BufferedReader(new FileReader("src/main/resources/Labels.txt"));
			String currentLine;
			while((currentLine=reader.readLine())!=null)
			{
				categories.add(new DataRow(currentLine));
			}
			reader.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		for(JPanel placeholder:categories)
			add(placeholder);
		
		
	}

}
