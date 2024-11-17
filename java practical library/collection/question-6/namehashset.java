// 3) Create two hash sets {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and {"George", "Katie",
// "Kevin", "Michael", "Ryan"}, and find their union, difference, and intersection.

import java.util.HashSet;

class namehashset{
    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<String>();
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");
        System.out.println("set1 : " + set1);

        HashSet<String> set2 = new HashSet<String>();
        set2.add("George");
        set2.add("Kevin");
        set2.add("Michael");
        set2.add("Ryan");
        System.out.println("set2 : " + set2);

        HashSet<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union : " + union);

        HashSet<String> diffrence = new HashSet<>(set1);
        diffrence.removeAll(set2); 
        System.out.println("difference : " + diffrence);

        HashSet<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection : " + intersection);

    }
}

