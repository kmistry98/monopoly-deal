package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import cards.Card;
import game.Player;

public class AddCardAsMoney implements ActionListener{

	private JList list;
	private JButton button;
	private Player player;
	private DefaultListModel moneyModel;
	private DefaultListModel listModel;

	public AddCardAsMoney(JList<Card> list, JButton b, Player p, DefaultListModel moneyModel, DefaultListModel listModel) {
		this.list = list;
		this.button = b;
		this.player = p;
		this.moneyModel = moneyModel;
		this.listModel = listModel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Card c = (Card) list.getSelectedValue();
		System.out.println(c.getName());
		if(c.getType() == 1 || c.getType() == 2) {
			if(moneyModel.firstElement() == "No money put down yet!") {
				moneyModel.remove(0);
				moneyModel.addElement(c);
				listModel.remove(list.getSelectedIndex());
			}
			else {
				moneyModel.addElement(c);
				listModel.remove(list.getSelectedIndex());
			}
		}
		else {
			JOptionPane.showMessageDialog(list,"Please only select money or action cards");
		}

	}

}
