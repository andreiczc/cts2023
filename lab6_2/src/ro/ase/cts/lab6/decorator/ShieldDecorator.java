package ro.ase.cts.lab6.decorator;


import ro.ase.cts.lab6.api.HeroInterface;

/**
 * decorates a Hero
 * adds a shield that can protect
 * up to x points (x is an arg in the constructor)
 */
public class ShieldDecorator extends AbstractDecorator {

    private int shieldCapacity;

    public ShieldDecorator(HeroInterface implementation, int shieldCapacity) {
        super(implementation);
        this.shieldCapacity = shieldCapacity;
    }

    @Override
    public void defend(int points) {
        if(shieldCapacity > points) {
            System.out.println("Protected by shield");
        } else {
            super.defend(points);
        }
    }
}
