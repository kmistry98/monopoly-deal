package controller;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import cards.Card;

public class LabelListener implements ListSelectionListener{

	private JList list;
	private JLabel label;

	
	public LabelListener(JList list, JLabel label) {
		this.list = list;
		this.label = label;
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(e.getValueIsAdjusting()) {
			Card c = (Card) list.getSelectedValue();
			label.setText("Value: " + c.getValue() + "M");
		}
	}

}
