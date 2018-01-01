package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import cards.Card;
import game.Player;
import view.Hand;

public class AddCardAsProperty implements ActionListener{
	private JList list;
	private JButton button;
	private Player player;
	private DefaultListModel model;
	private DefaultListModel listModel;

	public AddCardAsProperty(JList<Card> list, JButton b, Player p, DefaultListModel propertyModel, DefaultListModel listModel) {
		this.list = list;
		this.button = b;
		this.player = p;
		this.model = propertyModel;
		this.listModel = listModel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Card c = (Card) list.getSelectedValue();
		if(c.getType() == 0) {
			if(model.firstElement() == "No properties put down yet!") {
				model.remove(0);
				model.addElement(c);
				listModel.remove(list.getSelectedIndex());
				Hand.counter++;
				Hand.checkNumberOfCardsPutDown();

			}
			else {
				model.addElement(c);
				listModel.remove(list.getSelectedIndex());
				Hand.counter++;
				Hand.checkNumberOfCardsPutDown();

			}
		}
		else {
			JOptionPane.showMessageDialog(list,"Please only select properties");
		}

		//		ArrayList<Card> l = (ArrayList<Card>) list.getSelectedValue();
		//	
		//		boolean a = false;
		//		for(int i=0;i<l.size();i++) {
		//			if(l.get(i).getType() == 0) {
		//				a = true;
		//			}
		//			else {
		//				a=false;
		//				break;
		//			}
		//		}
		//		if(a==false) {
		//			JOptionPane.showMessageDialog(list,"Please only select properties");
		//		}
		//		else {
		//			for(int i=0;i<l.size();i++) {
		//			//player.getProperty().add((Property) l.get(i));
		//			System.out.println(l.size());
		//			model.addElement(l.get(i));
		//			//player.getHand().remove(l.get(i));
		//			Hand.frame.dispose();
		//			
		//			}
		//		}
	}


}
