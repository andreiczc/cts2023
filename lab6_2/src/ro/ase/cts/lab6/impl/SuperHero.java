package ro.ase.cts.lab6.impl;

import ro.ase.cts.lab6.api.HeroInterface;

public class SuperHero implements HeroInterface {


    @Override
    public void attack(int points) {
        System.out.println("Attacking with " + points + " points");
    }

    @Override
    public void defend(int points) {
        System.out.println("Defending with " + points + " points");
    }
}
