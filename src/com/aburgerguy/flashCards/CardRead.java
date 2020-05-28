package com.aburgerguy.flashCards;


//main purpose is to assign the cards into an array stack and then allow it to send back that stack to the game class


import java.io.File;
import java.util.Scanner;

public class CardRead {

    private File flashCardDir;
    private File[] fileList;
    private Scanner reader;

    public CardRead(String cardDircetory){
        flashCardDir = new File(cardDircetory);
        System.out.println(flashCardDir.getAbsolutePath());
        fileList = flashCardDir.listFiles();


    }

    public FlashCard[] createCards(){
        FlashCard createdCard;
        FlashCard[] flashCardsStack = new FlashCard[fileList.length];
        int cardPlace = 0;

        for (File card : fileList){
            if (card.exists() && card.canRead()){
                try {
                    reader = new Scanner(new File(flashCardDir +"\\"+card.getName()));
                    System.out.println(card.getName());


                    if (reader.hasNextLine()){
                        createdCard = new FlashCard(reader.nextLine(),reader.nextLine());

                        flashCardsStack[cardPlace] = createdCard;

                        }



                cardPlace++;
                } catch (Exception e){
                    System.out.println("File not found doode");
                }


            }
        }


        return flashCardsStack;
    }

    public String getCardName(){
        return "not implemented";
    }

}
