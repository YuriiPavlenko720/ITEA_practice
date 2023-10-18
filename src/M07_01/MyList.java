package M07_01;

import java.util.ArrayList;

public class MyList<TYPE> {
    private ArrayList<TYPE> list = new ArrayList<>(0);

    public void add(TYPE obj){
        list.add(obj);
    }

    public TYPE valueOf(int num){
            return list.get(num);
    }

    public int length(){
        return list.size();
    }

}
