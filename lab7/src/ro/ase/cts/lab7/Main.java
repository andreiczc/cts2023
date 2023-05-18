package ro.ase.cts.lab7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Point> generateCharacter() {
        var points = new ArrayList<Point>();
        for(var i = 0; i < 10000; ++i) {
            points.add(new Point(1, 2, 3));
        }

        return points;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        var points = generateCharacter();
        var model = new Model(points);
        var character = new GameCharacter("name1", model);
        var character2 = new GameCharacter("name2", model);
    }
}