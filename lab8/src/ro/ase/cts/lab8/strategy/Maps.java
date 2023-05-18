package ro.ase.cts.lab8.strategy;

import ro.ase.cts.lab8.strategy.strategy.Strategy;

public class Maps {

    /*
    implement a method computeTime
    receives int -> noKm
        if traveling by car, time = distance / 2
        if traveling by foot, time = distance

    returns int
     */

    private Strategy strategy;

    public Maps(Strategy strategy) {
        this.strategy = strategy;
    }

    public int computeTime(int km) {
        return strategy.computeTime(km);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
