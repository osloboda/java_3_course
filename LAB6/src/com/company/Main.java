package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s ="I realy love labki)";
        String longest = Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(longest);

        System.out.println("\n");
        hasNoneLetters("abcdef", "llh");
        hasNoneLetters("abcdef", "gh");
        hasNoneLetters("ABCD", "def");
        hasNoneLetters("abcd", "DEF");

        System.out.println("\n");


        findmultiples.multiples(3,5);


        System.out.println("\n");


        ArrayReverser.reverse(new String[]{"Get", "outside"});
        System.out.println("\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Write your number: ");
        int i = sc.nextInt();

        digSum(i);
        System.out.println("\n");

        System.out.print("Write seconds: ");
        i = sc.nextInt();
        task3(i);
    }

    public static strictfp void task3(int seconds)
    {
        if(seconds > 369999)
            System.out.println("ERROR");
        else {
            String time = null;
            int hh = 0, mm = 0, ss = seconds;

            hh = ss / 60 / 60;
            mm = (ss / 60 - hh * 60);
            ss = ss - hh * 60 * 60 - mm * 60;

            time = hh + ":" + mm + ":" + ss;

            System.out.println(time);
        }
    }

    static void digSum(int n) {
        int sum = 0;

        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }




    private static boolean hasNoneLetters(String blacklist, String phrase) {
        char[] one = blacklist.toLowerCase().toCharArray();
        char[] two = phrase.toLowerCase().toCharArray();
        boolean duplicate = true;
        for (char i : one){
            for (char j : two){
                if (i == j){
                    duplicate = false;
                }
            }
        }
        System.out.println(one);
        System.out.println(two);
        return duplicate;
    }
}