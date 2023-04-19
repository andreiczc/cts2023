package ro.ase.cts.lab6.impl;

import ro.ase.cts.lab6.api.Entity2;

public class Entity2Impl implements Entity2 {
    @Override
    public void run() {
        System.out.println("Running...");
    }

    @Override
    public void modifyHealth(int points) {
        if(points > 0) {
            System.out.println("Gaining " + points + " points");
        } else {
            System.out.printf("Losing " + points + " points");
        }
    }
}
