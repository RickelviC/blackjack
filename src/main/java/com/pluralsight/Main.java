package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        Hand hand = new Hand();

        deck.shuffle();
        deck.shuffle();

        System.out.print("Enter player 1 name: ");
        String playerOne = scanner.next();

        System.out.println(playerOne);
        hand.deal(deck.deal());
        hand.deal(deck.deal());

        hand.print();

    }
}
