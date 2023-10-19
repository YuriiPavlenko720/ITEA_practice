package M07_03;

import java.util.Arrays;

public class ModernUnidirectionalLinkedList<T> {
    private Object[] modernList = new Object[0];

    public int size() {
        return modernList.length;
    }

    public void add(final T o) {
        Object[] newList = new Object[modernList.length + 1];
        for (int i = 0; i < modernList.length; i++) {
            newList[i] = modernList[i];
        }
        newList[newList.length - 1] = o;
        modernList = newList;
    }

    public void add(final int index, final T data) {
        if (index >= 0 && index < modernList.length) {
            Object[] newList = new Object[modernList.length + 1];
            for (int i = 0; i < index; i++) {
                newList[i] = modernList[i];
            }
            newList[index] = data;
            for (int i = index + 1; i < newList.length; i++) {
                newList[i] = modernList[i - 1];
            }
            modernList = newList;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < modernList.length) {
            Object[] newList = new Object[modernList.length - 1];
            for (int i = 0; i < index; i++) {
                newList[i] = modernList[i];
            }
            for (int i = index; i < newList.length; i++) {
                newList[i] = modernList[i + 1];
            }
            modernList = newList;
        }
    }

    public void remove(T data) {
        Object[] newList = new Object[modernList.length - 1];
        for (int i = 0; i < modernList.length; i++) {
            if (data.equals(modernList[i])) {
                for (int j = 0; j < i; j++) {
                    newList[j] = modernList[j];
                }
                for (int j = i; j < newList.length; j++) {
                    newList[j] = modernList[j + 1];
                }
            }
        }
        modernList = newList;
    }

    public void insertHead(T data) {
        Object[] newList = new Object[modernList.length + 1];
        for (int i = 0; i < modernList.length; i++) {
            newList[i + 1] = modernList[i];
        }
        newList[0] = data;
        modernList = newList;
    }

    @Override
    public String toString() {
        return "ModernUnidirectionalLinkedList{" +
                "modernList=" + Arrays.toString(modernList) +
                '}';
    }
}
