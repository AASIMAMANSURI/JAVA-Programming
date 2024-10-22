public class Sphere extends Figure implements IFig {

    public Sphere(Double r)
    {
        this.r =r;
    }
    @Override
    public void calcAreaQ() {
        area = 4 * PI * r * r;
    }

    @Override
    public void calcVolumeO() {
        volume = (4 * PI * r * r * r) /3;
    }

    @Override
    public void dispAreaQ() {
        System.out.println("Area  of Sphere: "+ area);
    }

    @Override
    public void dispVolumeO() {
        System.out.println("volume  of Sphere: "+ volume);
    }
    
}
