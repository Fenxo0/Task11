package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предложение:\n");
        String str = in.nextLine();
        revers(str);
    }

    public static void revers (String s){
        String[] word = s.split(" ");
        String[] words = new StringBuilder(s).reverse().toString().split(" ");
        StringBuilder newStr = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) newStr.append(words[i]).append(" ");
        System.out.println(newStr);
    }
}
