package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import cards.Card;
import game.Board;
import game.Player;

public class PuttingCardDown implements ActionListener{

	private JList list;
	private DefaultListModel listModel;
	private JLabel label;
	private Player player;
	
	public PuttingCardDown(JList list, Player p,DefaultListModel listModel,JLabel label) {
		this.list = list;
		this.listModel = listModel;
		this.label = label;
		this.player = p;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Card c = (Card) list.getSelectedValue();
		if(c.getType() == 2) {
			listModel.remove(list.getSelectedIndex());
			Board.getCardsInTheMiddle().add(c);
			c.play(player);
			label.setText(c.getName());
			//add to cards in the middle
		}
		else {
			JOptionPane.showMessageDialog(list,"Please select an action card");

		}
	}

}
