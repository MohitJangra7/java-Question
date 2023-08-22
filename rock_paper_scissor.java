package projects;

import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Enter the number of round you want to play: ");
        int round = sc.nextInt();

        while (round > 0) {
            System.out.print("Enter your choice 0=Rock,  1=Paper,  2=Scissor: ");
            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("You have chosen Rock");
            } else if (choice == 1) {
                System.out.println("You have chosen Paper");
            } else if (choice == 2) {
                System.out.println("You have chosen Scissor");
            } else {
                System.out.println("Enter correct choice");
            }


            int rm = rd.nextInt(3);
            if (rm==2) {
                System.out.println("Opponent has chosen Rock");
            } else if (rm==1) {
                System.out.println("Opponent has chosen Paper");
            } else {
                System.out.println("Opponent has chosen Scissor");
            }

            if (choice == rm) {
                System.out.println("It's a draw");
            } else if (choice == 0 && rm == 2) {
                System.out.println("You win");
            } else if (choice == 1 && rm == 0) {
                System.out.println("you win");
            } else if (choice == 2 && rm == 1) {
                System.out.println("you win");
            } else {
                System.out.println("You lose");
            }

            round--;
        }
    }

    }

