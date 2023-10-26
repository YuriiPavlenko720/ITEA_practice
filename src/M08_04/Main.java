package M08_04;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a size of the list (N): ");
        int n = scanner.nextInt();
        LinkedList<Integer> list01 = new LinkedList<>();
        getIntegerList(n, list01);
        System.out.println("The minimum number is " + getMinimum(list01) + ".");

        //optimized?
        System.out.println("Input a size of the list (N): ");
        n = scanner.nextInt();
        LinkedList<Integer> list02 = new LinkedList<>();
        getIntegerListOptimized(n, list02);
        System.out.println("The minimum number is " + getMinimumOptimized(list02) + ".");
    }

    public static LinkedList<Integer> getIntegerList(int size, LinkedList<Integer> list) {
        if (size > 0) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < size; i++) {
                System.out.println("Input " + (i + 1) + " number: ");
                list.add(scanner.nextInt());
            }
        } else {
            System.out.println("Warning! Incorrect input. The list is not changed!");
        }
        return list;
    }

    public static int getMinimum(LinkedList<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static LinkedList<Integer> getIntegerListOptimized(int size, LinkedList<Integer> list) {
        if (size > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input 1 number: ");
            list.add(scanner.nextInt());
            int num;
            for (int i = 1; i < size; i++) {
                System.out.println("Input " + (i + 1) + " number: ");
                num = scanner.nextInt();
                if (num < list.get(0)) {
                    list.addFirst(num);
                } else {
                    list.add(num);
                }
            }
        } else {
            System.out.println("Warning! Incorrect input. The list is not changed!");
        }
        return list;
    }

    public static int getMinimumOptimized(LinkedList<Integer> list) {
        return list.get(0);
    }
}
