package set_list_map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("minh");
        arrayList.add("uy");
        arrayList.add("lực");
        arrayList.add("lục");
        System.out.println(arrayList);
        Iterator<String> iterator = arrayList.iterator();
        iterator.remove();
        System.out.println(arrayList);
        List<String> linkedList = (LinkedList) iterator;
        
    }
}
