package ui;

<<<<<<< HEAD
import javax.swing.ImageIcon;
=======
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Card;
import entities.GamePlay;
import ui.labels.CardView;

<<<<<<< HEAD
import javax.swing.JLabel;
import javax.swing.JOptionPane;
=======
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
<<<<<<< HEAD
import java.awt.event.ActionEvent;

=======
import java.util.regex.Pattern;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * When the player insert "trade" in the main game UI, this JFrame will pop out
 * This JFrame shows all the cards that the current player has in a visualized way (showing the card views)
 * The player can use command to finish one trade command or just simply choose three cards on the screen by click the right image
 * @author Boxiao Yu 40070128
 * @author Yilun Sun 40092802
 * @author Yuhua Jiang 40083453
 * @author Jiuxiang Chen 40086723
 * @author Chao Ye 40055665
 */
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
public class Trade extends JFrame{

	private static final long serialVersionUID = 1L;
	private Vector<Card> chosen_cards_list = new Vector<Card>();
	private JPanel contentPane;
<<<<<<< HEAD
	
	/**
	 * Create the frame.
=======
	private JTextField textField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trade frame = new Trade();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Check if these three input number are correct, can not be the same and must smaller then the player maximum card number
	 * @param a the first number
	 * @param b the second number
	 * @param c the third number
	 * @param g object of game
	 * @return
	 */
	private boolean checkNumValid(int a, int b, int c, GamePlay g) {
		if(a!=b&&a!=c&&b!=c&&a<=g.getPlayer().getOwnCard().size()&&b<=g.getPlayer().getOwnCard().size()&&c<=g.getPlayer().getOwnCard().size()) {
			return true;
		}
		return false;
	}
	
	/**
	 * Check if these three cards in chosen list can meet the requirement based on the rules
	 * If it pass the validation then add extra armies to the current player, if not, clear the chosen list
	 * @param game object of game
	 * @return boolean, success or not
	 */
	public boolean tradeCard(GamePlay game) {
		if(chosen_cards_list.size()!=3) {
			JOptionPane.showMessageDialog(null, "You can only choose three cards!", "Warning", JOptionPane.ERROR_MESSAGE);
		}
		else {
			int flag = 0;
			if((chosen_cards_list.get(0).getType().equals("Infantry")&&chosen_cards_list.get(1).getType().equals("Infantry")&&chosen_cards_list.get(2).getType().equals("Infantry"))||
					(chosen_cards_list.get(0).getType().equals("Cavalry")&&chosen_cards_list.get(1).getType().equals("Cavalry")&&chosen_cards_list.get(2).getType().equals("Cavalry"))||
					(chosen_cards_list.get(0).getType().equals("Artillery")&&chosen_cards_list.get(1).getType().equals("Artillery")&&chosen_cards_list.get(2).getType().equals("Artillery"))||
					(!chosen_cards_list.get(0).getType().equals(chosen_cards_list.get(1).getType())&&
					!chosen_cards_list.get(0).getType().equals(chosen_cards_list.get(2).getType())&&
					!chosen_cards_list.get(1).getType().equals(chosen_cards_list.get(2).getType()))) {
				game.getPlayer().addTradeTimes();
				flag = game.getPlayer().getTradeTimes()*5;
				game.getPlayer().rewardArmy(flag);
			}
			else {
				JOptionPane.showMessageDialog(null, "You cannot trade with these cards!", "Warning", JOptionPane.ERROR_MESSAGE);
			}
			if(flag!=0) {
				for(Card c:chosen_cards_list) {
					game.getPlayer().getOwnCard().remove(c);
				}
				game.alertObservers();
				JOptionPane.showMessageDialog(null, "Trade success! You have "+flag+" extra armies!", "Good luck", JOptionPane.INFORMATION_MESSAGE);
				dispose();
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Create the frame.
	 * This default constructor is only for test
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
	 */
	public Trade() {
		setTitle("Trade");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
<<<<<<< HEAD
		setBounds(100, 100, 760, 414);
=======
		setBounds(100, 100, 760, 450);
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
<<<<<<< HEAD
		ImageIcon icon1 = new ImageIcon("source\\Infantry.jpg");
		ImageIcon icon2 = new ImageIcon("source\\Cavalry.jpg");
		ImageIcon icon3 = new ImageIcon("source\\Artillery.jpg");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(50, 50, 120, 200);
		lblNewLabel.setIcon(icon1);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBounds(180, 50, 120, 200);
		label.setIcon(icon2);
		contentPane.add(label);
		
		JLabel label1 = new JLabel("");
		label1.setBounds(310, 50, 120, 200);
		label1.setIcon(icon3);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("");
		label2.setBounds(440, 50, 120, 200);
		label2.setIcon(icon1);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("");
		label3.setBounds(570, 50, 120, 200);
		label3.setIcon(icon2);
		contentPane.add(label3);
		
		JButton btnTrade = new JButton("trade");
		btnTrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnTrade.setBounds(187, 302, 113, 30);
		contentPane.add(btnTrade);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancel.setBounds(440, 302, 113, 30);
		contentPane.add(btnCancel);
	}
	
	public Trade(GamePlay game) {
		setTitle("Trade");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 760, 414);
=======
		for(int i = 0;i<5;i++) {
			CardView l = new CardView(new Card(), new ImageIcon("source\\Infantry.jpg"));
			l.reSetCount();
			l.setBounds(50+130*i, 50, 120, 200);
			l.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					l.getRepresent().changeView();
					if(l.getCount()%2==1) {
						chosen_cards_list.add(l.getRepresent());
					}
					else {
						chosen_cards_list.remove(l.getRepresent());
					}
				}
			});
			contentPane.add(l);
		}
			
		JButton btnTrade = new JButton("trade");
		btnTrade.setBounds(187, 340, 113, 30);
		contentPane.add(btnTrade);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.setBounds(440, 340, 113, 30);
		contentPane.add(btnCancel);
		
		textField = new JTextField();
		textField.setBounds(50, 285, 513, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnRun = new JButton("run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnRun.setBounds(577, 284, 113, 27);
		contentPane.add(btnRun);
	}
	
	/**
	 * Create the frame.
	 * @param game object of game
	 */
	public Trade(GamePlay game) {
		setTitle("Trade");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 760, 450);
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
<<<<<<< HEAD
=======
		//Create card views
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
		for(int i = 0;i<game.getPlayer().getOwnCard().size();i++) {
			CardView l = game.getPlayer().getOwnCard().get(i).getCardView();
			l.reSetCount();
			l.setBounds(50+130*i, 50, 120, 200);
			l.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					l.getRepresent().changeView();
					if(l.getCount()%2==1) {
						chosen_cards_list.add(l.getRepresent());
					}
					else {
						chosen_cards_list.remove(l.getRepresent());
					}
<<<<<<< HEAD
					System.out.println(chosen_cards_list.size());
=======
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
				}
			});
			contentPane.add(l);
		}
		
		JButton btnTrade = new JButton("trade");
		btnTrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				if(chosen_cards_list.size()!=3) {
					JOptionPane.showMessageDialog(null, "You can only choose three cards!", "Warning", JOptionPane.ERROR_MESSAGE);
				}
				else {
					int flag = 0;
					if((chosen_cards_list.get(0).getType().equals("Infantry")&&chosen_cards_list.get(1).getType().equals("Infantry")&&chosen_cards_list.get(2).getType().equals("Infantry"))||
							(chosen_cards_list.get(0).getType().equals("Cavalry")&&chosen_cards_list.get(1).getType().equals("Cavalry")&&chosen_cards_list.get(2).getType().equals("Cavalry"))||
							(chosen_cards_list.get(0).getType().equals("Artillery")&&chosen_cards_list.get(1).getType().equals("Artillery")&&chosen_cards_list.get(2).getType().equals("Artillery"))||
							(!chosen_cards_list.get(0).getType().equals(chosen_cards_list.get(1).getType())&&
							!chosen_cards_list.get(0).getType().equals(chosen_cards_list.get(2).getType())&&
							!chosen_cards_list.get(1).getType().equals(chosen_cards_list.get(2).getType()))) {
						game.getPlayer().addTradeTimes();
						flag = game.getPlayer().getTradeTimes()*5;
						game.getPlayer().rewardArmy(flag);
					}
					else {
						JOptionPane.showMessageDialog(null, "You cannot trade with these cards!", "Warning", JOptionPane.ERROR_MESSAGE);
					}
					if(flag!=0) {
						for(Card c:chosen_cards_list) {
							game.getPlayer().getOwnCard().remove(c);
						}
						game.alertObservers();
						JOptionPane.showMessageDialog(null, "Trade success! You have "+flag+" extra armies!", "Good luck", JOptionPane.INFORMATION_MESSAGE);
						dispose();
					}
				}
			}
		});
		btnTrade.setBounds(187, 302, 113, 30);
=======
				tradeCard(game);
			}
		});
		btnTrade.setBounds(187, 340, 113, 30);
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
		contentPane.add(btnTrade);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(game.getPlayer().getOwnCard().size()>=5) {
					JOptionPane.showMessageDialog(null, "You have reached the maximum number of cards, please trade!", "Information", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					dispose();
				}
			}
		});
<<<<<<< HEAD
		btnCancel.setBounds(440, 302, 113, 30);
		contentPane.add(btnCancel);
	}
}
=======
		btnCancel.setBounds(440, 340, 113, 30);
		contentPane.add(btnCancel);
		
		textField = new JTextField();
		textField.setBounds(50, 285, 513, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnRun = new JButton("run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pattern = "exchangecards [1-5] [1-5] [1-5]";
				if(!textField.getText().equals("")&&Pattern.matches(pattern, textField.getText())) {
					String[] split = textField.getText().split(" ");
					if(checkNumValid(Integer.parseInt(split[1]),Integer.parseInt(split[2]),Integer.parseInt(split[3]),game)) {
						chosen_cards_list.add(game.getPlayer().getOwnCard().get(Integer.parseInt(split[1])-1));
						chosen_cards_list.add(game.getPlayer().getOwnCard().get(Integer.parseInt(split[2])-1));
						chosen_cards_list.add(game.getPlayer().getOwnCard().get(Integer.parseInt(split[3])-1));
						if(!tradeCard(game)) {
							chosen_cards_list.clear();
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Command invalid!", "Warning", JOptionPane.ERROR_MESSAGE);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Command invalid!", "Warning", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnRun.setBounds(577, 284, 113, 27);
		contentPane.add(btnRun);	
	}
}

>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
