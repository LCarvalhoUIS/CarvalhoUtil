/** Carvalho Util
 * @author Lucas Carvalho
 * @version 1.2
 * 
 */
package com.carvalho.util.gui;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * Holds the data description and the data itself.
 * @author PC
 *
 */
@SuppressWarnings("serial")
public class DataRow extends JPanel {
	
	private JLabel dataDescription;
	private JLabel dataValue;

	/**
	 * Default constructor. sets the description value, and places a temporary
	 * blank on the value itself.
	 * @param description
	 */
	public DataRow(String description) {
		setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		dataDescription=new JLabel(description+": ");
		dataValue=new JLabel("Blank");
		add(dataDescription);
		add(dataValue);
		setVisible(true);

	}
	/**
	 * Sets the data value for this row.
	 * @param data
	 */
	public void setDataValue(String data)
	{
		dataValue.setText(data);
	}

}
