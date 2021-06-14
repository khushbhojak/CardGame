/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.*;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
=======
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author KhushBhojak
 * 991603851
 */

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        //draws 7 cards for the user
        for (int i=0; i<magicHand.length; i++)
        
        {
            Card c = new Card();
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            String CompCard = (Card.SUITS[(int) (Math.random() * 4)]);
           //c.setValue(insert call to random number generator here)
            int CompNum=((int)(Math.random()*14))+1;
            c.setSuit(CompCard);
            c.setValue(CompNum);
            magicHand[i]= c;
            }
            Scanner input=new Scanner(System.in);
            
            System.out.println("Enter the card number(1-13): ");
            int CardNum=input.nextInt();
            
            System.out.println("Choose a suit(Spades,Hearts,Diamonds,Clubs):");
            String CardSuit =input.next();
            boolean guess=false;
            for(int i = 0; i<magicHand.length; i++)
        {
            if (magicHand[i].getValue() == CardNum && magicHand[i].getSuit() == CardSuit)
            {
             guess=true;   
            }
            System.out.println(magicHand[i].getSuit()+" "+magicHand[i].getValue());
        }
        if(guess==true)
        {
            System.out.println("The user choosen card  " +CardNum+" and "+CardSuit+" is in the magic hand" );
        }
        else
        {
        System.out.println("The user choosen card  " +CardNum+" and "+CardSuit+" is not the magic hand" );
        }
    }
}
