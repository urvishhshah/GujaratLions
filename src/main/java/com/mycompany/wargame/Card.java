/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wargame;

/**
 *
 * @author urvis
 */
public class Card {
    
    public static enum TYPES {
        SPADE, DIAMOND, CLUB, HEARTS
    }

    public static enum VALUE {
        ACE, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, KING, QUEEN
    }
    
    private final TYPES type; 
    private final VALUE value; 
    final public static String[] SUITS = {"SPADE","DIAMOND","CLUB","HEARTS"};
    final public static String[] VALUES = {"ACE", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN","JACK","KING","QUEEN"};
    final public static int LIMIT = 10000;

    public Card(TYPES s, VALUE nVal){
        type = s;
        value = nVal;
    }
   
    public VALUE getValue() {
        return this.value; 
    }
     
    public TYPES getSuit() {
        return this.type;
    }

    public static TYPES getSuit(String x) {
        for (TYPES type : TYPES.values()) {
            if (type.toString().compareTo(x) == 0) {
                return type;
            }
        }
        return null;
    }
     
    public static VALUE getValue(String x) {
        for (VALUE value : VALUE.values()) {
            if (value.toString().compareTo(x) == 0) {
                return value;
            }
        }
        return null;
    }
     
    public static String getStringSuit(TYPES type_x) {
        return type_x.name();
    }
     
    public String toString() {
        return this.type.toString();
    }

    boolean beats(Card c2extra) {
        int a = getValueAsInt(this.value);
        int b = getValueAsInt(c2extra.value);
        return a > b;
    }

    boolean equalsForWar(Card c2) {
        return this.value.compareTo(c2.value) == 0;
    }
    
    private int getValueAsInt(VALUE value) {
        switch (value) {
            case ACE:
                return 14;
            case TWO:
                return 2;
            case THREE:
                return 3;
            case FOUR:
                return 4;
            case FIVE:
                return 5;
            case SIX:
                return 6;
            case SEVEN:
                return 7;
            case EIGHT:
                return 8;
            case NINE:
                return 9;
            case TEN:
                return 10;
            case JACK:
                return 11;
            case QUEEN:
                return 12;
            case KING:
                return 13;
            default:
                return 0; // Handle unknown values here
        }
    }
    
}
