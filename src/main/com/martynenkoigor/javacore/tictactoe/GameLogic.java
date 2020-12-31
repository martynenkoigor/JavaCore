package com.martynenkoigor.javacore.tictactoe;

public class GameLogic {
    Field field;

    GameLogic(Field field) {
        this.field = field;
    }

    public boolean checkWinner() {
        if (field.gamefield[0] == 'X' && field.gamefield[1] == 'X' && field.gamefield[2] == 'X') {
            System.out.println("X won!");
            return false;
        } else if(field.gamefield[3] == 'X' && field.gamefield[4] == 'X' && field.gamefield[5] == 'X') {
            System.out.println("X won!");
            return false;
        } else if (field.gamefield[6] == 'X' && field.gamefield[7] == 'X' && field.gamefield[8] == 'X') {
            System.out.println("X won!");
            return false;
        } else if (field.gamefield[0] == 'X' && field.gamefield[3] == 'X' && field.gamefield[6] == 'X') {
            System.out.println("X won!");
            return false;
        } else if (field.gamefield[1] == 'X' && field.gamefield[4] == 'X' && field.gamefield[7] == 'X') {
            System.out.println("X won!");
            return false;
        } else if (field.gamefield[2] == 'X' && field.gamefield[5] == 'X' && field.gamefield[8] == 'X') {
            System.out.println("X won!");
            return false;
        } else if (field.gamefield[0] == 'X' && field.gamefield[4] == 'X' && field.gamefield[8] == 'X') {
            System.out.println("X won!");
            return false;
        } else if (field.gamefield[2] == 'X' && field.gamefield[4] == 'X' && field.gamefield[6] == 'X') {
            System.out.println("X won!");
            return false;
        } else if (field.gamefield[0] == '0' && field.gamefield[1] == '0' && field.gamefield[2] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.gamefield[3] == '0' && field.gamefield[4] == '0' && field.gamefield[5] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.gamefield[6] == '0' && field.gamefield[7] == '0' && field.gamefield[8] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.gamefield[0] == '0' && field.gamefield[3] == '0' && field.gamefield[6] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.gamefield[1] == '0' && field.gamefield[4] == '0' && field.gamefield[7] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.gamefield[2] == '0' && field.gamefield[5] == '0' && field.gamefield[8] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.gamefield[0] == '0' && field.gamefield[4] == '0' && field.gamefield[8] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.gamefield[2] == '0' && field.gamefield[4] == '0' && field.gamefield[6] == '0') {
            System.out.println("0 won!");
            return false;
        } else if (field.gamefield[0] != '1' && field.gamefield[1] != '2' && field.gamefield[2] != '3' &&
                field.gamefield[3] != '4' && field.gamefield[4] != '5' && field.gamefield[5] != '6' &&
                field.gamefield[6] != '7' && field.gamefield[7] != '8' && field.gamefield[8] != '9') {
            System.out.println("Draw!");
            return false;
        } else
            return true;
    }
}
