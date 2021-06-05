package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 04
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        String noun = inputNoun();
        String verb = inputVerb();
        String adjective = inputAdj();
        String adverb = inputAdv();

        String outputString = generateoutputString(noun, verb, adjective, adverb);
        printOutput(outputString);

    }

    private static String inputNoun() {

        System.out.print("Enter a noun: ");
        String noun = in.nextLine();
        return noun;

    }
    private static String inputVerb() {

        System.out.print("Enter a verb: ");
        String verb = in.nextLine();
        return verb;

    }
    private static String inputAdj() {

        System.out.print("Enter an adjective: ");
        String Adj = in.nextLine();
        return Adj;

    }

    private static String inputAdv() {

        System.out.print("Enter an adverb: ");
        String Adv = in.nextLine();
        return Adv;

    }

    private static String generateoutputString(String noun, String verb, String Adj, String Adv){

        return "Do you " +verb+ " your " +Adj+" " +noun+ Adv+ "? That's hilarious!";

    }

    private static void printOutput(String outputString){

        System.out.println(outputString);

    }
}
