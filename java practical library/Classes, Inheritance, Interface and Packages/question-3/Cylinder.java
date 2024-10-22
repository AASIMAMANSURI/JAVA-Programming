class Cylinder extends Figure implements IFig{

    private Double h;

    
    public Cylinder(Double h,double r)
    {
        this.h =h;
        this.r =r;
    }
    @Override
    public void calcAreaQ() {
        area =(2*PI*r*r)+(2*PI*r*h);
    }

    @Override
    public void calcVolumeO() {
        volume = PI * r * r * h;
    }

    @Override
    public void dispAreaQ() {
        System.out.println("Area  of Cylinder: "+ area);
    }

    @Override
    public void dispVolumeO() {
        System.out.println("volume  of Cylinder: "+ volume);
    }
}