package ro.ase.lab5;

import ro.ase.lab5.models.SuperPower;
import ro.ase.lab5.models.Superhero;

import java.util.Objects;

public class Application {

    public static void main(String[] args) throws CloneNotSupportedException {
        var builder = new Superhero.SuperheroBuilder("name1", false, "model.bin");
        builder.setPower1(SuperPower.FLY)
                .setPower2(SuperPower.RUN);
        var superhero = builder.build();
        System.out.println(superhero.toString());

        var superhero2 = superhero.clone();
        System.out.println(superhero2.toString());
        System.out.println(Objects.equals(superhero, superhero2));
    }
}
