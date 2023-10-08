package M05_05_v2;

public class ModernFactory implements Factory{


    @Override
    public void createAndSendToStore(Furniture furniture) {
        Furniture[] newList = new Furniture[Store.getStoredBatch().length + 1];
        for (int i = 0; i < Store.getStoredBatch().length; i++) {
            newList[i] = Store.getStoredBatch()[i];
        }
        newList[newList.length - 1] = furniture;
        Store.setStoredBatch(newList);
    }

    @Override
    public void createBatch() {
        createAndSendToStore(new Armchair("Крісло - \"Стар шіп\"", 1340));
        createAndSendToStore(new Sofa("Диван - \"Гіпер портал\"", 5340.17));
        createAndSendToStore(new Table("Столик - \"Пульт керування\"", 4340));
        // сюди при необхідності додаються додаткові меблі, що вміє створювати завод, не ламаючи інші класи і заводи
    }
}
