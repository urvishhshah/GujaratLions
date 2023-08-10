/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wargame;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author urvis
 */
public class Player {
    
    private String playerID1; //variable for unique ID of player1
    private String playerID2; //variable for unique ID of player2
    private String player1;//variable for storing name of player1
    private String player2;//variable for storing name of player2

    
    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID1;
    }

    public String getPlayerID2() {
        return playerID2;
    }

    public void setPlayerID1(int givenID1) {
        playerID1 = givenID1+"";
    }

    public void setPlayerID2(int givenID2) {
        playerID2 = givenID2+"";
    }

    /**
     * Method where the game is programmed. 
     */
    public void play() {

        Random r = new Random();
        Card x =null;


        ArrayList<Card> deck = new ArrayList<Card>();
        for (int i = 0; i < 4; i++)
        {
            for (int j = 1; j <= 13; j++){
                
                x = new Card(Card.getSuit(Card.SUITS[i]), Card.getValue(Card.VALUES[j]));
                deck.add(x);
            }
        }

        
        ArrayList<Card> player1 = new ArrayList<Card>();
        ArrayList<Card> player2 = new ArrayList<Card>();

        
        int cnt = 0;
        while (deck.size() > 0) {
            int nextCard = r.nextInt(deck.size());
            if (cnt % 2 == 0) {
                Card c1 = deck.remove(nextCard);
                player1.add(c1);
            } else {
                player2.add(deck.remove(nextCard));
            }
            cnt++;
        }

        int winner = -1, turns = 0;

        
        while (player1.size() > 0 && player2.size() > 0 && turns < Card.LIMIT) {

            
            System.out.println("Player 1 - "+getPlayer1()+" has " + player1.size() + " cards and Player 2 - "+getPlayer2() +" has "+ player2.size() + " cards.");

            Card c1 = player1.remove(0);
            Card c2 = player2.remove(0);

            
            System.out.println("Player 1 - "+getPlayer1()+" plays " + c1 + " and Player 2 - "+ getPlayer2()+" plays " + c2);

            
            if (c1.equalsForWar(c2)) {

                
                System.out.println("We have a war!!!");

                
                if (player1.size() < 2) {
                    winner = 2;
                    System.out.println("Player 1 - "+getPlayer1()+" ran out of cards in a war battle.");
                    break;
                } 
                else if (player2.size() < 2) {
                    winner = 1;
                    System.out.println("Player 2 - "+getPlayer2()+" ran out of cards in a war battle.");
                    break;
                } 
                else {

                    
                    ArrayList<Card> tmp = new ArrayList<Card>();
                    for (int i = 0; i < 2; i++) {
                        tmp.add(player1.remove(0));
                        tmp.add(player2.remove(0));
                    }

                    
                    Card c1extra = player1.remove(0);
                    Card c2extra = player2.remove(0);

                    
                    System.out.println("In the card battle player 1 played " + c1extra + " and player 2 played " + c2extra);

                    
                    if (c1extra.beats(c2extra)) {

                        
                        player1.add(c1);
                        player1.add(c2);
                        player1.add(c1extra);
                        player1.add(c2extra);
                        for (Card c : tmp) {
                            player1.add(c);
                        }

                        System.out.println("Player 1 wins the battle and gets all 8 cards!");
                    } else {

                        
                        player2.add(c1);
                        player2.add(c2);
                        player2.add(c1extra);
                        player2.add(c2extra);
                        for (Card c : tmp) {
                            player2.add(c);
                        }

                        System.out.println("Player 2 wins the battle and gets all 8 cards!");
                    }
                }
            } 
            else {
                if (c1.beats(c2)) {
                    player1.add(c1);
                    player1.add(c2);
                    System.out.println("Player 1 wins the battle and gets 2 cards.");
                } else {
                    player2.add(c2);
                    player2.add(c1);
                    System.out.println("Player 2 wins the battle and gets 2 cards.");
                }

            }

            turns++;
            System.out.println();
        }

        if (turns == Card.LIMIT) {
            System.out.println("Sorry, after 10000 turns no one won, so the game is a tie!");
        }
        else if (winner == -1) {
            if (player2.size() == 0) {
                winner = 1;
            } else {
                winner = 2;
            }
        }

        
        if (winner != -1) {
            System.out.println("Congratulations - The winner is player " + winner);
            if(winner==1)
            {
                System.out.println("Congratulations "+getPlayer1()+"!");
                System.out.println("Better Luck Next Time "+getPlayer2()+"!");
            }
            if(winner!=1)
            {
                System.out.println("Congratulations "+getPlayer2()+"!");
                System.out.println("Better Luck Next Time "+getPlayer1()+"!");
            }
        }

    }

    
    public String getPlayer1() {
        return player1;
    }

    
    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    
    public String getPlayer2() {
        return player2;
    }

    
    public void setPlayer2(String player2) {
        this.player2 = player2;
    }
    
}
