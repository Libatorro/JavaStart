package Teamt17_Strinigi;

/**
 * Created by Sebastian on 2016-04-16.
 */
import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj liczbę wyrazów: ");
        int wordsNumber = input.nextInt();
        input.nextLine();

        String[] words = new String[wordsNumber];

        for(int i=0; i<wordsNumber; i++) {
            System.out.println("Podaj kolejne słowo: ");
            words[i] = input.nextLine();
        }

        StringBuilder build = new StringBuilder();
        for(int i=0; i<wordsNumber; i++) {
            build.append(words[i].charAt(words[i].length() - 1));
        }

        System.out.println("Nowe słowo: " + build.toString());

        input.close();
    }
}