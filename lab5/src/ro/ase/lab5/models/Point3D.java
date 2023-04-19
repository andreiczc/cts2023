package ro.ase.lab5.models;

public class Point3D implements Cloneable {

    private int x;
    private int y;
    private int z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public Point3D clone() throws CloneNotSupportedException {
        return (Point3D) super.clone();
    }
}
