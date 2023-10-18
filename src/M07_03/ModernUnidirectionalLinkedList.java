package M07_03;

import java.util.LinkedList;

public class ModernUnidirectionalLinkedList<T> {
    private LinkedList<T> modernList = new LinkedList<>();

    public int size(){
        return modernList.size();
    }

    public void add(final T o){
        modernList.add(o);
    }
    public void add(final int index, final T data){
        modernList.add(index, data);
    }

    public void remove(int index){
        modernList.remove(index);
    }

    public void remove(T data){
        modernList.remove(data);
    }

    public void insertHead(T data){
        modernList.add(0, data);
    }

    @Override
    public String toString() {
        return "ModernUnidirectionalLinkedList{" +
                "modernList=" + modernList +
                '}';
    }
}
