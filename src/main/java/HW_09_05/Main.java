package HW_09_05;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        Animal cat1 = new Cat();
        System.out.println(cat1);

        Class testCat = Cat.class;

        Animal animal1 = new Animal();
        System.out.println(animal1);

        Class testAnimal = Animal.class;

        try {
            Field name = testCat.getDeclaredField("name");
            name.setAccessible(true);
            name.set(cat1, "Moon Cat");

            Field real = testCat.getDeclaredField("real");
            real.set(cat1, false);

            Field color = testCat.getDeclaredField("color");
            color.set(cat1, "green");

            Field nutrition = testCat.getDeclaredField("NUTRITION");
            nutrition.setAccessible(true);
            nutrition.set(cat1, "herbivorous");

            Field legs = testCat.getField("legs");
            legs.setAccessible(true);
            Field modifier1 = Field.class.getDeclaredField("modifiers");
            modifier1.setAccessible(true);
            modifier1.setInt(legs, legs.getModifiers() & ~Modifier.FINAL);
            legs.set(cat1, (short) 8);

            Field regnum = testCat.getField("REGNUM");
            regnum.setAccessible(true);
            Field modifier2 = Field.class.getDeclaredField("modifiers");
            modifier2.setAccessible(true);
            modifier2.setInt(regnum, regnum.getModifiers() & ~Modifier.FINAL);
            regnum.set(cat1, "Alien");

            Field location = testAnimal.getDeclaredField("location");
            location.setAccessible(true);
            location.set(animal1, "Moon");

            Field domen = testAnimal.getDeclaredField("DOMEN");
            domen.setAccessible(true);
            Field modifier3 = Field.class.getDeclaredField("modifiers");
            modifier3.setAccessible(true);
            modifier3.setInt(domen, domen.getModifiers() & ~Modifier.FINAL);
            domen.set(animal1, "Lunatics");

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(cat1);
        System.out.println(animal1);
    }
}
