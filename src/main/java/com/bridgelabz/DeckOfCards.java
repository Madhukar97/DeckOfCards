package com.bridgelabz;

import java.util.Arrays;
import java.util.Random;

public class DeckOfCards {

    protected String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    protected String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    protected static String[] array = new String[52];


    public static void main(String[] args) {
        DeckOfCards obj = new DeckOfCards();
        obj.generateRandomCards();
        Arrays.sort(array);
        obj.showCards();
    }

    //Method to show the deck of cards
    public void showCards() {
        System.out.println("all cards " + Arrays.toString(array) + " \n");
    }

    //Method to generate deck of cards
    public void generateRandomCards() {
        Arrays.fill(array, "");
        for (int i = 0; i < array.length; i++) {
            String card = randomCard();
            for (int j = 0; j <= i; j++) {
                if (array[j].equals(card)) {
                    card = randomCard();
                    j = 0;
                }
            }
            array[i] = card;
        }
    }

    /**
     *
     * @return returns a random card
     */
    private String randomCard() {
        Random rand = new Random();
        return suit[rand.nextInt(4)] + " " + rank[rand.nextInt(13)];
    }
}
