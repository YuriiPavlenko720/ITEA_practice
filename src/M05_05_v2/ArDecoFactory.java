package M05_05_v2;

public class ArDecoFactory implements Factory {
    public static Furniture[] createdSet = new Furniture[0];


    public void addToCreatedSet(Furniture furniture) {
        Furniture[] newList = new Furniture[createdSet.length + 1];
        for (int i = 0; i < createdSet.length; i++) {
            newList[i] = createdSet[i];
        }
        newList[newList.length - 1] = furniture;
        createdSet = newList;
    }

    public void createdSetInfo() {
        System.out.println("Детальний опис:");
        double sum = 0;
        for (int i = 0; i < createdSet.length; i++) {
            sum += createdSet[i].getPrice();
            System.out.println(createdSet[i]);
        }
        System.out.println("Загальна сума: " + sum + "грн.");
    }

    @Override
    public void createSet() {
        addToCreatedSet(new Armchair("Ар-деко", "Осіння тиша", 1830));
        addToCreatedSet(new Sofa("Ар-деко", "Вечірній шторм", 4480));
        addToCreatedSet(new Table("Ар-деко", "Волошкове поле", 3200.22));
        // сюди при необхідності додаються додаткові меблі, що вміє створювати завод, не ламаючи інші класи і заводи
    }
}
