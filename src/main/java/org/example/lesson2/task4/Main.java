package org.example.lesson2.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputString();
    }

    private static void inputString() {
        System.out.println("Введите текст:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Вы ввели пустую строку");
        } else {
            System.out.println(str);
        }
    }
}