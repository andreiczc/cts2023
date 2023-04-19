package ro.ase.cts.lab6.adapters;

import ro.ase.cts.lab6.api.Entity1;
import ro.ase.cts.lab6.api.Entity2;

// entity2 -> entity1
// we need an entity2 to implement entity1 contract
public class Entity2ToEntity1Adapter implements Entity1 {

    private final static int SUPPORTED_MOVE = 10;

    private final Entity2 entity2;

    public Entity2ToEntity1Adapter(Entity2 entity2) {
        this.entity2 = entity2;
    }

    @Override
    public void move(int places) {
        if(places != SUPPORTED_MOVE) {
            throw new UnsupportedOperationException();
        }

        entity2.run();
    }

    @Override
    public void attack(int points) {
        entity2.modifyHealth(points);
    }

    @Override
    public void defend(int points) {
        entity2.modifyHealth(points * -1);
    }
}
