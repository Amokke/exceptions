package org.example.lesson2.task2;

public class Main {
    public static void main(String[] args) {
        //Отсутствовала переменная int[] intArray
        int[] intArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
