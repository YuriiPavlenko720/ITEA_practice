package M07_02;

public class MyDictionary<KEY, VALUE> {
    private Object[] keyList = new Object[0];
    private Object[] valueList = new Object[0];

    public void addPair(KEY key, VALUE value){
        Object[] newKeyList = new Object[keyList.length + 1];
        Object[] newValueList = new Object[valueList.length + 1];
        for (int i = 0; i < keyList.length; i++) {
            newKeyList[i] = keyList[i];
            newValueList[i] = valueList[i];
        }
        newKeyList[newKeyList.length - 1] = key;
        newValueList[newValueList.length - 1] = value;
        keyList = newKeyList;
        valueList = newValueList;
    }

    public Object getAnswer(KEY key){
        for (int i = 0; i < keyList.length; i++) {
            if (key.equals(keyList[i])) {
                return valueList[i];
            }
        }
        return null;
    }

    public int size(){
        return keyList.length;
    }
}
