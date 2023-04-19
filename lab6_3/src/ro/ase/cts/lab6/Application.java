package ro.ase.cts.lab6;

import ro.ase.cts.lab6.adapters.Entity2ToEntity1Adapter;
import ro.ase.cts.lab6.api.Entity1;
import ro.ase.cts.lab6.api.Entity2;
import ro.ase.cts.lab6.impl.Entity1Impl;
import ro.ase.cts.lab6.impl.Entity2Impl;

/**
 * Entity 1
 *      -> move(speed)
 *      -> attack(points)
 *      -> defend(points)
 *
 * Entity 2
 *      -> run(); assumed moving 10 places
 *      -> modifyHealth(points)
 *
 * End Goal: List<Entity1>
 */
public class Application {

    public static void main(String[] args) {
        Entity1 entity1 = new Entity1Impl();
        Entity2 entity2 = new Entity2Impl();

        entity1.attack(10);
        entity2.modifyHealth(10);

        Entity1 adapter = new Entity2ToEntity1Adapter(entity2);
        adapter.attack(10);
    }
}
