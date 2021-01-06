package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void SortOnlyC(List<String> list)
    {
        list
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

    public static strictfp void Task2(int n)
    {
        int[] arr = new int[n];
        Random rand = new Random();

        System.out.print("\n" + Arrays.stream(arr).map(a -> a = rand.nextInt(10)).average().getAsDouble() + "\n");
    }

    public static void Task3(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) >= 'h' && str.charAt(i) <= 't') {
                char gg = (char)(str.charAt(i) - 32);
                str = str.substring(0, i) + gg + str.substring(i+1);
            }
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        SortOnlyC(Arrays.asList("a1", "c8", "b1", "a1", "c5", "b1", "c5", "d1"));

        Task2(5);

        Task3("jgrfjbchfhkglb");
    }
}
