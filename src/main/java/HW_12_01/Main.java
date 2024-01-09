package HW_12_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(10);
        myList.add(3);
        myList.add(-2);
        myList.add(0);
        myList.add(10);
        myList.add(1);
        myList.add(9);
        myList.add(3);
        myList.add(11);
        myList.add(2);
        myList.add(-4);

        int result = myList.stream().map(x -> x*x).reduce((x,y) -> x + y).get();

        System.out.println(result);
    }
}
