class Cone extends Figure implements IFig{

    private Double h,s ;  
      
    public Cone(Double h, Double s,Double r)
    {
        // super(r);
        this.h =h;
        this.s= s;
        this.r =r;
    }  
    @Override
    public void calcAreaQ() {
        area =(PI*r*s)+(PI*r*r);
    }

    @Override
    public void calcVolumeO() {
        volume = (PI * r * r * h)/3;
    }

    @Override
    public void dispAreaQ() {
System.out.println("Area  of Cone: "+ area);
    }

    @Override
    public void dispVolumeO() {
        System.out.println("Volume  of Cone: "+ volume);
    }


    
}