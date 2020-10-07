package com.aburgerguy.flashCards;


public class Main {

    public static void main(String[] args) {
	// write your code here

        FlashCard helloCard = new FlashCard("hello","a greeting");

        CardRead reader = new CardRead("C:\\Users\\Grey McDermitt\\Documents\\FlashCards");

        //LinkedList<FlashCard> cardStack = new LinkedList<>();

        //cardStack.add(helloCard);

        //System.out.println(helloCard.getCardName());
        //System.out.println(helloCard.getDefinition());
        //System.out.println(helloCard.compareToDefinition(""));
        //System.out.println(helloCard.compareToTerm("hello"));

        FlashCard[] cards = reader.createCards();
        System.out.println(cards[2].getCardName());

        Game game = new Game(cards);

    }
}
