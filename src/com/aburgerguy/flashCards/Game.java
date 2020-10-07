package com.aburgerguy.flashCards;

//main purpose is to facilitate the user interface in console

//requirements for constructor :
//1. must have a card stack to play with
//2. must have a time limit if specified
//3. time limit must be specified for there to be a time

import java.util.Scanner;

//W.I.P

public class Game {

    private int score = 0;

    public Game(FlashCard[] gameCards){
        System.out.println("Welcome to Burger's flashcard extravaganza! Enjoy the game!");

        Scanner input = new Scanner(System.in);
        //game loop
        for(FlashCard flashCard : gameCards){
            System.out.println("Term : " + flashCard.getCardName());
            System.out.print("what do you think the answer is? : ");
            String answer = input.nextLine();
            if (flashCard.compareToDefinition(answer)){
                System.out.println("That's correct! :)");
                score++;
            } else {
                System.out.println("Sorry that's wrong :(");
                if (score > 0) score--;

            }
            System.out.println("Score : " + score  + "\n");


        }
        System.out.println("You finished with a score of : " + score + "!");

    }

}
