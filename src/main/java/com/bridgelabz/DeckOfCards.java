package com.bridgelabz;

import java.util.Arrays;

public class DeckOfCards {

    protected String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    protected String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    protected static String[] array = new String[52];

    public static void main(String[] args) {
        DeckOfCards obj = new DeckOfCards();
        obj.generateDeck();
        obj.showCards();
    }

    /**
     * Method to show the deck of cards
     */
    public void showCards() {
        System.out.println("all cards " + Arrays.toString(array) + " \n");
    }

    /**
     * Method to generate the deck
     */
    public void generateDeck() {
        int k = 0;
        for (String suit : suit) {
            for (String rank : rank) {
                array[k] = suit + " " + rank;
                k++;
            }
        }
    }
}
