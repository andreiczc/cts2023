package ro.ase.cts.lab7;

import java.util.ArrayList;
import java.util.List;

// it has to be immutable
public class Model {

    // common part among all objects
    private List<Point> points;

    public Model(List<Point> points) {
        this.points = new ArrayList<>(points);
    }

    public List<Point> getPoints() {
        return new ArrayList<>(points);
    }
}
