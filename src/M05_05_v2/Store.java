package M05_05_v2;

public class Store {
    private static Furniture[] storedBatch = new Furniture[0];

    public static void storedBatchInfo() {
        System.out.println("Детальний опис:");
        double sum = 0;
        for (int i = 0; i < storedBatch.length; i++) {
            sum += storedBatch[i].getPrice();
            System.out.println(storedBatch[i]);
        }
        System.out.println("Загальна сума: " + sum + "грн.");
    }

    static void setStoredBatch(Furniture[] storedBatch) {
        Store.storedBatch = storedBatch;
    }

    static Furniture[] getStoredBatch() {
        return storedBatch;
    }
}
