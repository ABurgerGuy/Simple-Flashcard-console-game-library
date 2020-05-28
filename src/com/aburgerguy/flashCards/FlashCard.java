package com.aburgerguy.flashCards;

//This file defines what each flash card should contain and uses a constructor to make sure that we know what each
//element we need to make a flash card.
//I use this to work with the "CardRead.java" class and make a card for each file

public class FlashCard {

    private String term = "";
    private String definition = "";

    public FlashCard(String termCard, String termDef){
        term = termCard;
        definition = termDef;
    }

    public String getCardName(){ return term; }

    public String getDefinition(){ return definition; }

    public Boolean compareToTerm(String entry){
        if (entry.equals(term)) return true;

        return false;
    }

    public Boolean compareToDefinition(String entry){
        if (entry.equals(definition)) return true;

        return false;
    }


}

