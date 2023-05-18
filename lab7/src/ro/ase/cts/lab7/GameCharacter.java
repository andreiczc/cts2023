package ro.ase.cts.lab7;

import java.util.List;

public class GameCharacter {

    // unique
    private String name;

    // common
    private Model model;

    public GameCharacter(String name, Model model) {
        this.name = name; // immutable, safe to shallow copy
        this.model = model; // immutable, safe to shallow copy
    }
}
