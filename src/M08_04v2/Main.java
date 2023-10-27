package M08_04v2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static LinkedList<Integer> listMin = new LinkedList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a size of the list (N): ");
        int n = scanner.nextInt();
        LinkedList<Integer> list01 = new LinkedList<>();
        getIntegerListOptimized(n, list01);
        System.out.println("The minimum number is " + getMinimumOptimized() + ".");
    }

    public static LinkedList<Integer> getIntegerListOptimized(int size, LinkedList<Integer> list) {
        if (size > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input 1 number: ");
            list.add(scanner.nextInt());
            int min = list.get(0);
            listMin.add(list.get(0));
            int num;
            for (int i = 1; i < size; i++) {
                System.out.println("Input " + (i + 1) + " number: ");
                num = scanner.nextInt();
                if (num < min) {
                    list.add(num);
                    listMin.add(num);
                } else {
                    list.add(num);
                }
            }
        } else {
            System.out.println("Warning! Incorrect input. The list is not changed!");
        }
        return list;
    }

    public static int getMinimumOptimized() {
        return listMin.getLast();
    }
}
