package HW_09_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть повну назву класу для дослідження: ");
        String className = scanner.next();

        try {
            Class<?> examClass = Class.forName(className);

            Class<?>[] interfaces = examClass.getInterfaces();
            System.out.println("Клас " + examClass.getName() + " імплементує " + interfaces.length + " інтерфейсів:");
            for (int i = 0; i < interfaces.length; i++) {
                System.out.println(i + 1 + ") " + interfaces[i].getName());
            }

            Class<?> superClass = examClass.getSuperclass();
            System.out.println("Суперклас класу:");
            System.out.println(superClass.getName());

            int modifiers = examClass.getModifiers();
            System.out.println("Модифікатори класу:");
            System.out.println(Modifier.toString(modifiers));

            Constructor[] constructors = examClass.getDeclaredConstructors();
            System.out.print("Клас має " + constructors.length + " конструкторів з наступними типами параметрів:");
            for (int c = 0; c < constructors.length; c++) {
                System.out.print("\n" + (c + 1) + ") ");
                Class[] paramTypes = constructors[c].getParameterTypes();
                for (Class p : paramTypes) {
                    System.out.print(p.getTypeName() + ", ");
                }
            }
            System.out.println();

            Field[] fields = examClass.getDeclaredFields();
            System.out.print("Клас має " + fields.length + " полів:");
            for (int f = 0; f < fields.length; f++) {
                System.out.print("\n" + (f + 1) + ") " + Modifier.toString(fields[f].getModifiers()) + " "
                        + fields[f].getType() + " " + fields[f].getName());
            }
            System.out.println();

            Method[] methods = examClass.getDeclaredMethods();
            System.out.print("Клас має " + methods.length + " методів:");
            for (int m = 0; m < methods.length; m++) {
                System.out.print("\n" + (m + 1) + ") " + Modifier.toString(methods[m].getModifiers()) + " "
                        + " " + methods[m].getName() + "(");
                Class[] paramTypesOfMethods = methods[m].getParameterTypes();
                for (Class p : paramTypesOfMethods) {
                    System.out.print(p.getTypeName() + ", ");
                }
                System.out.print(")");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("*****************************");
            System.out.println("Клас з такою назвою відсутній.");
        }
    }
}
