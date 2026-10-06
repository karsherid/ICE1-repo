/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import javax.swing.JOptionPane;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier April Margaux Joves
 * @991854001
 * @date October 5, 2026
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
       
            int num = (int)(Math.random() * 13) + 1;
            int suit = (int)(Math.random() * 4);

            c.setValue(num);
            c.setSuit(Card.SUITS[suit]);

            magicHand[i] = c;
        }
        
        int userV = Integer.parseInt(
                JOptionPane.showInputDialog("Enter a card value (1-13):"));

        String userS = JOptionPane.showInputDialog
            ("Enter suit (Hearts, Diamonds, Spades, or Clubs):");

        Card userC = new Card();
        userC.setValue(userV);
        userC.setSuit(userS);
        
        boolean found = false;

        for (int i = 0; i < magicHand.length; i++){
            if (magicHand[i].getValue() == userC.getValue()
                    && magicHand[i].getSuit().equals(userC.getSuit())){
                found = true;
            }
        }

        if (found){
            JOptionPane.showMessageDialog
                (null, "Congratulations, you found your card!");
        }
        else{
            JOptionPane.showMessageDialog
                (null, "Your card is not in the magic hand.");
        }
    }
}
    

