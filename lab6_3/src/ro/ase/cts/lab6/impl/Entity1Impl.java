package ro.ase.cts.lab6.impl;

import ro.ase.cts.lab6.api.Entity1;

public class Entity1Impl implements Entity1 {

    @Override
    public void move(int places) {
        System.out.println("Moving " + places + " places");
    }

    @Override
    public void attack(int points) {
        System.out.println("Attacking with " + points + " points");
    }

    @Override
    public void defend(int points) {
        System.out.println("Defending with " + points + " points");
    }
}
