package ro.ase.cts.lab8.strategy.strategy;

public class CarStrategy implements Strategy {


    @Override
    public int computeTime(int km) {
        return km / 2;
    }
}
