package M07_02;

import java.util.ArrayList;

public class MyDictionary<TYPE> {
    private ArrayList<ArrayList<TYPE>> dictionary = new ArrayList<>(0);

    public void addPair(TYPE key, TYPE answer){
        ArrayList<TYPE> pair = new ArrayList<>(2);
        pair.add(0, key);
        pair.add(1, answer);
        dictionary.add(pair);
    }

    public Object getAnswer(TYPE key){
        for (ArrayList pair: dictionary) {
            if (key.equals(pair.get(0))) {
                return pair.get(1);

            }
        }
        return null;
    }

    public int size(){
        return dictionary.size();
    }
}
