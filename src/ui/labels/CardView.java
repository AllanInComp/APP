package ui.labels;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

import entities.Card;

<<<<<<< HEAD
=======
/**
 * This JLabel is a view for card model
 * It containing the original card object and an image based on its type
 * This view will changed its border color based on the number it has been clicked
 * @author Administrator
 *
 */
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
public class CardView extends JLabel implements Observer{

	private static final long serialVersionUID = 1L;
	private int count = 0;
	private Card represent = new Card();
	
<<<<<<< HEAD
=======
	/**
	 * Constructor for CardView
	 * @param c object of its card
	 * @param icon linked image
	 */
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
	public CardView(Card c,ImageIcon icon){
		represent = c;
		setIcon(icon);
	}
	
<<<<<<< HEAD
=======
	/**
	 * The model will notify this view and this update method change its border color based on the number it has been clicked
	 */
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
	public void update(Observable arg0, Object arg1) {
		count++;
		if(count%2==1) {
			Border border = BorderFactory.createLineBorder(Color.red, 2);
			setBorder(border);
		}
		else {
			setBorder(null);
		}
	}

<<<<<<< HEAD
=======
	/**
	 * Getter of card it is represented
	 * @return card
	 */
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
	public Card getRepresent() {
		return represent;
	}
	
<<<<<<< HEAD
=======
	/**
	 * Getter of counter
	 * @return count
	 */
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
	public int getCount() {
		return count;
	}
	
<<<<<<< HEAD
=======
	/**
	 * Reset counter and its border
	 */
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
	public void reSetCount() {
		count = 0;
		if(this.getMouseListeners().length>=1) {
			this.removeMouseListener(this.getMouseListeners()[0]);
		}
		setBorder(null);
	}
	
<<<<<<< HEAD
}
=======
}
>>>>>>> 80b8ab57eb2a554dce5b3ca4663564e9e992fbd5
