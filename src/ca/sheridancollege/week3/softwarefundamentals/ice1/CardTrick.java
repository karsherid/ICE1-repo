/*
 * Kalkin Brijesh, Student # 991843203
 * SYST 17796 - ICE 1
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card.
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

        Scanner in = new Scanner(System.in);
        System.out.print("Pick a card value (1-13): ");
        int value = in.nextInt();
        System.out.print("Pick a suit (0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs): ");
        int suitIndex = in.nextInt();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suitIndex]);

        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == userCard.getValue()
                    && c.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
}
