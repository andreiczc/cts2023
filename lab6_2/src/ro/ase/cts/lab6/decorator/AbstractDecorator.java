package ro.ase.cts.lab6.decorator;

import ro.ase.cts.lab6.api.HeroInterface;

public abstract class AbstractDecorator implements HeroInterface {

    private final HeroInterface implementation;

    public AbstractDecorator(HeroInterface implementation) {
        this.implementation = implementation;
    }

    @Override
    public void attack(int points) {
        implementation.attack(points);
    }

    @Override
    public void defend(int points) {
        implementation.defend(points);
    }
}
