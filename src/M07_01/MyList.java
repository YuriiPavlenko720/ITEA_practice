package M07_01;

public class MyList<TYPE> {
    private Object[] list = new Object[0];

    public void add(TYPE obj){
        Object[] newList = new Object[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            newList[i + 1] = list[i];
        }
        newList[0] = obj;
        list = newList;
    }

    public Object valueOf(int num){
            return list[num];
    }

    public int length(){
        return list.length;
    }

}
