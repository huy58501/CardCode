/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CardCode;

/**
 *
 * @author chuong5850
 */
public class CardStrick{ 
    private int cardValue;
    private String cardSuit;

    public CardStrick(int cardValue, String cardSuit) {
        this.cardValue = cardValue;
        this.cardSuit = cardSuit;
    }

    public CardStrick() {}
    
    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
        if (cardValue == 1){
            cardSuit = "Spades";
        }
        else if (cardValue == 2){
            cardSuit = "Hearts";
        }else if (cardValue == 3){
            cardSuit = "Diamonds";
        }else if (cardValue == 4){
            cardSuit = "Clubs";
        }
        else System.out.println("The number should from 1 to 4");
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;
    }
    
    public String toString(){
        return "The cardValue is: "+ cardValue + " The cardSuit is: "+ cardSuit;
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        CardStrick c = new CardStrick();
        c.setCardValue(3);
        System.out.println(c.toString());
        
        CardStrick c1 = new CardStrick();
        c1.setCardValue(2);
        System.out.println(c1.toString());
    }
}
