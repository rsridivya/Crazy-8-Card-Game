/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

/**
 *
 * @author sr169
 */
public class Card {
    
    private int suit, facevalue;
    private String[] cardSuit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    private String[] cardValue = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

    public Card(int cSuit, int cValue)
    {
        suit = cSuit; 
        facevalue = cValue;
    }
    
    public int getValue()
    {
        return facevalue + 1;
    }
    
    public String getSuit()
    {
        return cardSuit[suit];
    }
    
   /*public String toString()
    {
        String cardInfo = cardValue[facevalue] + " of " + cardSuit[suit];

        return cardInfo;
    }
    */
    public String getImage()
    {
        String imageName = cardValue[facevalue] + cardSuit[suit] + ".png";

        return imageName;
}
   /* public String dropImage(int value, String suit)
    {
       int sp=0;
       if(suit=="Spades")
           sp=0;
       else if(suit=="Diamonds")
           sp=1;
       else if(suit=="Hearts")
           sp=3;
       else if(suit=="Clubs")
           sp=1;
       String imageName = cardValue[value] + cardSuit[sp] + ".png";

        return imageName;
       
    }*/

   
}

    
