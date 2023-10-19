package M07_02;

public class MyDictionary<KEY, VALUE> {
    private Cell[] dictionaryList = new Cell[0];

    class Cell<K, V> {
        K key;
        V value;

        public Cell(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

        public void addPair(KEY key, VALUE value){
        Cell[] newList = new Cell[dictionaryList.length + 1];
        for (int i = 0; i < dictionaryList.length; i++) {
            newList[i] = dictionaryList[i];
        }
        newList[newList.length - 1] = new Cell(key, value);
        dictionaryList = newList;
    }

    public Object getAnswer(KEY key){
        for (int i = 0; i < dictionaryList.length; i++) {
            if (key.equals(dictionaryList[i].key)) {
                return dictionaryList[i].value;
            }
        }
        return null;
    }

    public int size(){
        return dictionaryList.length;
    }
}
