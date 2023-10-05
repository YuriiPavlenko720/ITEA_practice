package M05_05;

public class StyleInfo {
    private Furniture[] formList = new Furniture[0];

    public void addToFormList(Furniture furniture) {
        Furniture[] newList = new Furniture[formList.length + 1];
        for (int i = 0; i < formList.length; i++) {
            newList[i] = formList[i];
        }
        newList[newList.length - 1] = furniture;
        formList = newList;
    }

    public void printFormList() {
        System.out.println("Детальний опис:");
        double sum = 0;
        for (int i = 0; i < formList.length; i++) {
            sum += formList[i].getPrice();
            System.out.println(formList[i]);
        }
        System.out.println("Загальна сума: " + sum + "грн.");

    }
}
