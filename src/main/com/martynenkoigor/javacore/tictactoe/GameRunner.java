package com.martynenkoigor.javacore.tictactoe;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        Field field = new Field();
        GameLogic gameLogic = new GameLogic(field);
        Scanner scanxo = new Scanner(System.in);
        char user = 'X';
        boolean inProgress = true;
        boolean correctInput;


        field.printField();



        while (inProgress) {
            System.out.println("Choose a free field number: ");

            int num = scanxo.nextInt();

            correctInput = field.putXO(num, user);

            if (correctInput == false) {
                System.out.println("Wrong input");
                continue;
            }

            field.printField();

            if (user == 'X') {
                user = '0';
            } else {
                user = 'X';
            }

            inProgress = gameLogic.checkWinner();



        }





    }

}
