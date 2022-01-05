package com.spartaglobal.aor;

import java.awt.*;
import java.io.OptionalDataException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class RPSApp {
    private static Logger logger = LogManager.getLogger("Rock, paper, scissors logger");

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ComputerChoice comp = new ComputerChoice();
        String playAgain = "";
        Random rand = new Random();
        int randomNumber = rand.nextInt(3);

        int playerScore = 0;
        int compScore = 0;

        String computerMove = "";
        String playerMove = "";


        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        } else if (randomNumber == 2) {
            computerMove = "scissors";
        }





        boolean play = true;
        int playRounds = 0;
//        int i = 0;
//        for ( i=0; i<=playRounds; i++);
        System.out.println("How many rounds would you like to play? ");
        playRounds = Integer.parseInt(scan.nextLine());
        System.out.println(playRounds);
        while (play) {




//            int i;
//            for (i = 0; i <= rounds; i++) {

                // store number of rounds in a variable that represents how many times to run while loop (number of times games are played)
                // throw execption for non-int input
                System.out.println("Choose: Rock, Paper or Scissors");
                playerMove = scan.nextLine();
                playerMove.toLowerCase(Locale.ROOT);

                System.out.println("You chose " + playerMove);
                System.out.println("Computer chose " + computerMove);

            if (playerMove.equals(computerMove)) {
                playerScore++;
                compScore++;
                System.out.println("It's a draw!");
            } else if (computerMove.equals("rock") && playerMove.equals("scissors")) {
                compScore++;
                System.out.println("You lose!");
            } else if (computerMove.equals("scissors") && playerMove.equals("rock")) {
                System.out.println("You win!");
                playerScore++;
            } else if (computerMove.equals("paper") && playerMove.equals("scissors")) {
                playerScore++;
                System.out.println("You win!");
            } else if (computerMove.equals("rock") && playerMove.equals("paper")) {
                playerScore++;
                System.out.println("You win!");
            } else if (computerMove.equals("scissors") && playerMove.equals("paper")) {
                compScore++;
                System.out.println("You lose!");
            } else if (computerMove.equals("paper") && playerMove.equals("rock")) {
                compScore++;
                System.out.println("You lose!");
            }


            System.out.println("Your score: " + playerScore + "\n" + "Computer score: " + compScore);

            System.out.println("Would you like to play again? Yes or no");
            playAgain = scan.nextLine();


            // if ()computer win is called, 1 point added to score

            // at end of all rounds, print out player scores, whoever has most is winner
            if(playAgain.equals("no")){
                System.out.println("Thank you for playing");
                break;
                // call player move
            }
//            else if(!playAgain.equals("yes") && !playAgain.equals("no")){
//                System.out.println("Sorry i didn't get recognise that, please try again entering yes or no ");
//
//            }

            }

            // change souts to logs


        }

    }
