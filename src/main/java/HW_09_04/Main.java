package HW_09_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        Class<?> examClass = Speaker.class;

        Field[] fields = examClass.getDeclaredFields();
        System.out.print("Клас " + examClass.getName() + " має " + fields.length + " поля:");
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
        System.out.println();

        Constructor[] constructors = examClass.getDeclaredConstructors();
        System.out.print("Клас має " + constructors.length + " конструкторів з наступними параметрами:");
        for (int c = 0; c < constructors.length; c++) {
            System.out.print("\n" + (c + 1) + ") " + Modifier.toString(constructors[c].getModifiers()) + " (");
            Class[] paramTypes = constructors[c].getParameterTypes();
            for (Class p : paramTypes) {
                System.out.print(p.getTypeName() + ", ");
            }
            System.out.print(")");
        }
        System.out.println();

        int modifiers = examClass.getModifiers();
        System.out.println("Модифікатори доступу класу:");
        System.out.println(Modifier.toString(modifiers));
    }
}
