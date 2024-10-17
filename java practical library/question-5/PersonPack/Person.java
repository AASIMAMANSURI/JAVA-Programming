package PersonPack;

import FlatPack.Flat;

public class Person {
    int PIDNumber;
    String name;
    private Flat flat;

    public Person(int id, String n, Flat f) {
        this.PIDNumber = id;
        this.name = n;
        this.flat = f;
    }

    public int getPIDNumber() {
        return this.PIDNumber;
    }

    public String getName() {
        return name;
    }

    public static void displayOwnershiplnfo(Person p, int p_id) {

        if (p.getPIDNumber() == p_id) {
            System.out.println("PERSON ID : " + p_id);
            System.out.println("name : " + p.getName());
            System.out.println("information about Flat : \n");

            p.flat.dispFlatlnfo();
        } else {
            System.out.println("person not found with this id " + p_id);
        }

    }

}