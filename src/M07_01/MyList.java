package M07_01;

public class MyList<TYPE> {
    private Object[] list = new Object[4];

    public void add(TYPE obj) {

        boolean isSet = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = obj;
                isSet = true;
                break;
            }
        }
        if (!isSet) {
            Object[] newList = new Object[list.length + list.length / 2];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            newList[list.length] = obj;
            list = newList;
        }
    }

    public Object valueOf(int num) {
        if (num >= 0 && num < list.length) {
            return list[num];
        } else {
            return null;
        }
    }

    public int length() {
        return list.length;
    }

}
