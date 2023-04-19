package ro.ase.cts.lab6;

import ro.ase.cts.lab6.api.HeroInterface;
import ro.ase.cts.lab6.decorator.ShieldDecorator;
import ro.ase.cts.lab6.impl.SuperHero;

/**
 * Hero Interface
 *      -> attack
 *      -> defend
 *
 * SuperHero implementation
 *
 *
 */

public class Application {

    public static void main(String[] args) {
        HeroInterface hero = new SuperHero();
        hero.attack(1);
        hero.defend(1);

        HeroInterface decoratedHero = new ShieldDecorator(hero, 10);
        decoratedHero.defend(5);
        decoratedHero.defend(15);

        HeroInterface twiceDecoratedHero = new ShieldDecorator(decoratedHero, 20);
        twiceDecoratedHero.defend(15);
        twiceDecoratedHero.defend(25);
    }

}
