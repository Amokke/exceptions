package org.example.lesson2.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float number = getFloat();
        System.out.println("Введенное число: " + number);
    }

    public static float getFloat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        while (!scanner.hasNextFloat()) {
            System.out.print("Ошибка ввода. Введите дробное число: ");
            scanner.next();
        }
        float number = scanner.nextFloat();
        scanner.close();
        return number;
    }
}
