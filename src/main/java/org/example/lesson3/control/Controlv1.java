package org.example.lesson3.control;

import org.example.lesson3.model.Model;

public class Controlv1 implements Control {
    @Override
    public void execute(String input) {
        new Model(input);
    }
}
