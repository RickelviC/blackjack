package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        deck.shuffle();
        deck.shuffle();

        System.out.print("Enter player 1 name: ");
        String playerOne = scanner.next();

        System.out.print("Enter player 2 name: ");
        String playerTwo = scanner.next();

        Hand player1 = new Hand();
        player1.deal(deck.deal());
        player1.deal(deck.deal());

        Hand player2 = new Hand();
        player2.deal(deck.deal());
        player2.deal(deck.deal());

        System.out.println();
        System.out.println(playerOne);
        player1.print();

        System.out.println();
        System.out.println(playerTwo);
        player2.print();

    }
}
