package view;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import cards.Card;
import controller.AddCardAsMoney;
import controller.AddCardAsProperty;
import controller.LabelListener;
import controller.PuttingCardDown;
import game.Board;
import game.Player;

public class Hand {

	public static JFrame frame;
	private static Player p;
	private static DefaultListModel propertyModel;
	private static DefaultListModel moneyModel;
	private DefaultListModel listModel;
	private JLabel cardsInMiddle;
	public static int counter = 0;

	/**
	 * Create the application.
	 */
	public Hand(Player p, DefaultListModel propertyModel, DefaultListModel moneyModel,JLabel cardsInMiddle) {
		this.propertyModel = propertyModel;
		this.moneyModel = moneyModel;
		this.p = p;
		this.cardsInMiddle = cardsInMiddle;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 464);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		
		
		

		JButton btnNewButton_1 = new JButton("Add as Money");
		btnNewButton_1.setBounds(280, 365, 150, 25);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblValue = new JLabel("Value: ");
		
		lblValue.setBounds(54, 303, 100, 15);
		frame.getContentPane().add(lblValue);
		
		JList list = new JList();
		list.setBounds(54, 75, 361, 170);
		frame.getContentPane().add(list);

		ArrayList<Card> a = Board.getPlayer(1).getHand();
		//ArrayList<String> b = new ArrayList<String>();
//		for(Card card: a) {
//			b.add(card.getName());
//		}
		DefaultListModel listModel = new DefaultListModel();
		for (int i =0;i<a.size();i++) {
			listModel.addElement(a.get(i));
		}
		list.setModel(listModel);
		list.addListSelectionListener(new LabelListener(list,lblValue));
		

		JButton btnNewButton = new JButton("Add as property");
		btnNewButton.addActionListener(new AddCardAsProperty(list,btnNewButton, p, propertyModel,listModel));
		btnNewButton.setBounds(455, 365, 200, 25);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1.addActionListener(new AddCardAsMoney(list,btnNewButton_1,p,moneyModel,listModel));
		
		JButton btnNewButton_2 = new JButton("Put Down");
		btnNewButton_2.setBounds(130, 365, 125, 25);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new PuttingCardDown(list,p,listModel,cardsInMiddle));

	}
	
	public static void checkNumberOfCardsPutDown() {
		if(counter>=3) {
			frame.dispose();
			
		}
	}

	
	
	
}
