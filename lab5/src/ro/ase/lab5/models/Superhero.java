package ro.ase.lab5.models;

import java.util.ArrayList;
import java.util.List;

public class Superhero implements Cloneable {

    private String name; // mandatory
    private boolean isVillain; // mandatory
    private String modelFile; // mandatory -> to read the points from
    private SuperPower power1;
    private SuperPower power2;
    private List<Point3D> model; // read from the modelFile

    private List<Point3D> readModelFromFile() {
        var list = new ArrayList<Point3D>();
        var point = 100;
        for(var i = 0; i < point; ++i) {
            var x = Math.random();
            var y = Math.random();
            var z = Math.random();

            list.add(new Point3D((int) x, (int) y, (int) z));
        }

        return list;
    }

    @Override
    public Superhero clone() throws CloneNotSupportedException {
        var instance = (Superhero) super.clone();
        instance.model = new ArrayList<>();
        for(var point : this.model) {
            instance.model.add(point.clone());
        }

        return instance;
    }

    public String getName() {
        return name;
    }

    public boolean isVillain() {
        return isVillain;
    }

    public SuperPower getPower1() {
        return power1;
    }

    public SuperPower getPower2() {
        return power2;
    }

    private void setPower1(SuperPower power1) {
        this.power1 = power1;
    }

    private void setPower2(SuperPower power2) {
        this.power2 = power2;
    }

    // needs to be private in order to forbid any creation of objects
    // outside builder
    private Superhero(String name, boolean isVillain, String modelFile) {
        this.name = name;
        this.isVillain = isVillain;
        this.modelFile = modelFile;
        this.model = readModelFromFile();
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", isVillain=" + isVillain +
                ", power1=" + power1 +
                ", power2=" + power2 +
                '}';
    }

    // create a builder -> [add optional fields] -> build()
    // build method returns the instance
    public static class SuperheroBuilder {

        private Superhero instance;

        public SuperheroBuilder(String name, boolean isVillain, String modelFile) {
            this.instance = new Superhero(name, isVillain, modelFile);
        }

        public SuperheroBuilder setPower1(SuperPower power1) {
            instance.setPower1(power1);

            return this;
        }

        public SuperheroBuilder setPower2(SuperPower power2) {
            instance.setPower2(power2);

            return this;
        }

        public Superhero build() {
            return instance;
        }
    }
}
