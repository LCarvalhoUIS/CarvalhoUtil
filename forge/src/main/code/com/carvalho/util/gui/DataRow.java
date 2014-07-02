package com.carvalho.util.gui;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DataRow extends JPanel {
	
	private JLabel dataDescription;
	private JLabel dataValue;

	
	public DataRow(String description) {
		setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		dataDescription=new JLabel(description+": ");
		dataValue=new JLabel("Blank");
		add(dataDescription);
		add(dataValue);
		setVisible(true);

	}

}
