# Simple-Flashcard-console-game-library
Welcome! This is one of the first libraries I'm creating and I had the want in mind to make it as versatile as it can be

The library works by creating the FlashCard class which takes a parameter for the term and definition.

You can do alot with this directory like read flashcard in a specific directory and send them to a game class.

The text files for the flashcards are the only restraint because they can only have 2 lines of text which go like this:
"
Term
Definition
"
This can be expanded upon if you look at the code but for the sake of simplicity I'm keeping it to two lines of text for it to read.

# FlashCard-Class

The Flashcard class is pretty simple but allows for you to see the term and definition aswell as a way to check if the term or definition
is correct with boolean return values. 

# CardRead-Class

The CardRead class uses the FlashCard class by finding the directory specified and turning each text file in the directory into a
FlashCard class. This is done in the createCards method and it returns a FlashCard[] to the variable specified.

# End

Once you have your flashcards in the variable the final step is to send them into whatever game you want. I made a simple flashcard game 
to exemplify what you can do with it. 

Have fun using the library and enjoy the world of coding!
