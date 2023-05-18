package ro.ase.cts.lab8.strategy;

import ro.ase.cts.lab8.strategy.strategy.CarStrategy;
import ro.ase.cts.lab8.strategy.strategy.WalkingStrategy;

public class Main {
    public static void main(String[] args) {
        var maps = new Maps(new WalkingStrategy());

        var result = maps.computeTime(10);
        System.out.println(result);
    }
}