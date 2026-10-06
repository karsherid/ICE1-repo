/*
 * Kalkin Brijesh, Student # 991843203
 * SYST 17796 - ICE 1
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then searches the hand for a hard-coded lucky card.
 * @author dancye
 * @modifier Kalkin Brijesh, Student # 991843203 - 2026-10-05
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }

        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit(Card.SUITS[2]);

        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue()
                    && c.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("You win! The lucky card is in the hand.");
        } else {
            System.out.println("You lose. The lucky card isn't in the hand.");
        }
    }
}