import java.util.Scanner;
class kilemeter_miles{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter distence in km : ");
        double km ;
        km = sc.nextFloat();

        double mile = km / 1.609;
        System.out.println(" distence in miles : " + mile );
    
    }
}