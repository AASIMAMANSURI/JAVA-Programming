abstract public class Figure {
    double r;
    Double area;
    Double volume;

    public abstract void dispAreaQ();

    public abstract void dispVolumeO();

    public static void main(String[] args) {

        Cone c1 = new Cone(12.0, 12.1,3.0);
        Sphere s1 = new Sphere(2.3);
        Cylinder cy1 = new Cylinder(3.5,3.5);

        c1.calcVolumeO();
        c1.calcAreaQ();
        c1.dispAreaQ();
        c1.dispVolumeO();

        s1.calcAreaQ();
        s1.calcVolumeO();
        s1.dispAreaQ();
        s1.dispVolumeO();

        cy1.calcAreaQ();
        cy1.calcVolumeO();
        cy1.dispAreaQ();
        cy1.dispVolumeO();
    }
}
