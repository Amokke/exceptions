package org.example.lesson3.view;

import org.example.lesson3.control.Control;
import org.example.lesson3.control.Controlv1;

import java.util.Scanner;

public class Viewv1 implements View {
    private final Control control;

    public Viewv1() {
        this.control = new Controlv1();
    }

    @Override
    public void start() {
        Scanner in = new Scanner(System.in).useDelimiter("\r?\n");
        while (true) {
            System.out.println("""
                    Введите данные в произвольном порядке, разделенные пробелом:
                    <ФИО дд.мм.гггг 0123456789 f|m>
                    введите [q] для выхода""");
            String input = in.next();
            if (input.equalsIgnoreCase("q")) System.exit(0);
            this.control.execute(input);
        }
    }
}
