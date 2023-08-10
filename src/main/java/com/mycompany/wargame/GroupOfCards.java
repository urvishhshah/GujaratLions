/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wargame;

/**
 *
 * @author urvis
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class GroupOfCards {
    
    private ArrayList <Card> cards;
    private int size;
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }
    
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }
 
    
    public int getSize() {
        return size;
    }
 
    
    public void setSize(int givenSize) {
        size = givenSize;
    }
  
 
    public class Game {
 
        public Collection<Player> players;
  
        public Collection<Player> getPlayers() {
            return this.players;
        }
 
        public void setPlayers(Collection<Player> players) {
            this.players = players;
        }
 
  
    }
    
}
