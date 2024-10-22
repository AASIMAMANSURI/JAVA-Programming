// 5. Create three packages—PersonPack, FlatPack and PFPack.
// a. Package PersonPack must contain a class called Person with the following attributes:
// PIDNumber, name, etc.
// i. It must have a reference variable of the type Flat.
// ii. It should have a static method displayOwnershiplnfo() that takes as an input
// parameter a variable of PIDNumber and returns void. This method must display
// the information about the classes Person and Flat.

// b. Package FlatPack must contain the class F with following attributes: apartmentName,
// flatNo and noOfBedrooms
// i. It should have method dispFlatlnfo() that displays information of the attributes
// of the class Flat.

// c. Package PFPack must contain a class called PFDemo that has a main method .
// i. create objects of the classes Person and Flat and
// ii. invoke the displayOwnershiplnfo() method

package PFPack;

import PersonPack.Person;
import FlatPack.Flat;

public class PFDemo {

    public static void main(String[] args) {
        Flat flat1 = new Flat("abc", 123, 3);
        Person p1 = new Person(102, "aasima", flat1);

        Person.displayOwnershiplnfo(p1, 102);
        // flat1.dispFlatlnfo();
    }
}
