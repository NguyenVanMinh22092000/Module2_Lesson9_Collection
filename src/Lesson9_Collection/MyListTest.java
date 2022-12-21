package Lesson9_Collection;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ListInteger = new MyList<Integer>();
        ListInteger.add(1);
        ListInteger.add(2);
        ListInteger.add(3);
        ListInteger.add(4);
        System.out.println("element 1 = " +   ListInteger.get(1));
    }
}
