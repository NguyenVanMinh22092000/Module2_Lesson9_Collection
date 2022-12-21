package set_list_map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //Creating an empty Set
        Set<String> st1 = new LinkedHashSet<>();

        //USE add() method to add elements into the set
        st1.add("Hello ! ");
        st1.add("Hello A");
        st1.add("Hello B");
        st1.add("Hello B ");
        st1.add("Hello C ");
        st1.add("Hello D ");

        // Displaying the set
        System.out.println("Set: " + st1);

        //Creating another Set
        Set <String> st2 = new LinkedHashSet<>();
        st2.add("Calm ");
        st2.add("down ! ");


        //Using the addAll() method to
        st1.addAll(st2);

        //Displaying the  final Set
        System.out.println("Set 1 after addAll : " + st1);

        // Check st2 in st1 Set
        System.out.println(st1.containsAll(st2));

        // Creating a set with collection st2
         Set<String> st3 = new HashSet<>(st2);
        System.out.println(st3);
    }
}
