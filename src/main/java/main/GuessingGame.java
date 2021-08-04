/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Elvin Aliyev
 */
public class GuessingGame {

    public static void main(String[] args) {
        Random r = new Random();
        int computerNumber = r.nextInt(100) + 1;
        int userAnswer = 0;
        int count = 1;
        while (userAnswer != computerNumber) {
            String inputString = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(inputString);

            JOptionPane.showMessageDialog(null, ""+findGuess(userAnswer, computerNumber, count));
            count++;
        }

    }

    public static String findGuess(int userAnswer, int computerNumber, int count) {
        if (userAnswer == computerNumber) {
            return "Correct\nTotal guesses " + count;
        } else if (userAnswer < computerNumber) {
            return "Your guess is low, try again\nTry number " + count;
        } else {
            return "Your guess is high, try again\nTry number " + count;
        }
    }
}
