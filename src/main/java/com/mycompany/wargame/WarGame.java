/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wargame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author urvis
 */
public class WarGame {

    public ArrayList <Player> players;
	   
	   public static void main(String[] args){
	       WarGame g= new WarGame();
	       Scanner sc = new Scanner(System.in);
	       
	       System.out.println("War!! - The Game of Cards!");
	       
	       Player x = new Player();
	       System.out.println("Enter Player 1 name : ");
	       String n1=sc.next();
	       System.out.println("Enter Player 2 name : ");
	       String n2=sc.next();
	       x.setPlayer1(n1);
	       x.setPlayer2(n2);
	       x.setPlayerID1((int)((Math.random()+1)*500000));
	       x.setPlayerID2((int)((Math.random()+1)*500000));
	       System.out.println();
	       System.out.println("Welcome : "+x.getPlayer1()+" : "+x.getPlayerID());
	       System.out.println("Welcome : "+x.getPlayer2()+" : "+x.getPlayerID2());

	       System.out.println();
	       System.out.println();
	       System.out.println("/t/tDETAILS/t/t");
	       
	       System.out.println("1.The game divides the deck of 52 cards into two players and then each player throws a random card.");
	       System.out.println("2.The cards are matched and the winning card takes both the cards");
	       System.out.println("3.If both the players throw same valued card, then its a WAR!");
	       System.out.println("4.The player with maximum cards wins!");
	       System.out.println(x);
	       sc.close();
	       x.play();
	       
	   }
	   
	   public WarGame()
	   {
	       players = new ArrayList<Player>();
	   }

	  
	   
	    
	   public ArrayList <Player> getPlayers() 
	   {
	       return players;
	   }

	   
	   public void setPlayers(ArrayList <Player> players) 
	   {
	       this.players = players;
	   }
	   
	   
	   public void play(){
	       
	   }
	   
	  
	   public static void declareWinner(){
	       
	   }
	   
}
