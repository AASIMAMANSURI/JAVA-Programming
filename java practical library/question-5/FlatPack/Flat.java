package FlatPack;

public class Flat {
    String apartmentName;
    int flatNo;
    int noOfBedrooms;

    public Flat(String a, int fn, int nb) {
        apartmentName = a;
        flatNo = fn;
        noOfBedrooms = nb;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public int getFlatNo() {
        return flatNo;
    }

    public int getNoOfBedrooms() {
        return noOfBedrooms;
    }

    public void dispFlatlnfo() {

        System.out.println("app name : " + this.getApartmentName());
        System.out.println(this.getFlatNo());
        System.out.println(this.getNoOfBedrooms());
    }
}
