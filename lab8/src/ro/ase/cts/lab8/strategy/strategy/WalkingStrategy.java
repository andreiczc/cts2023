package ro.ase.cts.lab8.strategy.strategy;

public class WalkingStrategy implements Strategy{
    @Override
    public int computeTime(int km) {
        return km;
    }
}
