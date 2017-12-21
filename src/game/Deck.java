/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools 
 */

package game;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author sridivya
 */
public class Deck {
    
    ArrayList <Card> deck = new ArrayList <Card>();   

    public Deck(){
        for(int i=0 ;i<4; i++)
        {
            for(int j=0 ;j < 13 ; j++)
            {
                 Card c = new Card(i,j);
                 deck.add(c);
            }
        } 
        for(int i=0 ;i<4; i++)
        {
            for(int j=0 ;j < 13 ; j++)
            {
                 Card c = new Card(i,j);
                 deck.add(c);
            }
        } 
    }
    
    public void shuffle(){
        Collections.shuffle(deck); 
    }
    public void printDeck(){
        for(int i = 0; i< 52 ; i++)
        System.out.println(deck.get(i));
       
    }
}
