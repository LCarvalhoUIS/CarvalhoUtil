package com.carvalho.util.gui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

	private JPanel contentPane;
	
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
		
		
		try {
			//Opens the file with the labels
			BufferedReader reader=new BufferedReader(new FileReader("src/main/resources/Labels.txt"));
			String currentLine;
			while((currentLine=reader.readLine())!=null)
			{
				categories.add(new DataRow(currentLine));
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		for(JPanel placeholder:categories)
			add(placeholder);
		
		
	}

}
