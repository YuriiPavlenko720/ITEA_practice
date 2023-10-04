package M05_04;

import java.util.Arrays;

public class CarInfo {
    private Car[] list = new Car[0];

    public void addToInfoList(Car car) {
        Car[] newList = new Car[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            newList[i + 1] = list[i];
        }
        newList[0] = car;
        list = newList;
    }

    public Car whichIsFaster() {
        Car faster = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].getSpeed() > list[i - 1].getSpeed()) {
                faster = list[i];
            }
        }
        return faster;
    }

    public Car whichIsMoreExpensive() {
        Car expensive = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].getPrice() > list[i - 1].getPrice()) {
                expensive = list[i];
            }
        }
        return expensive;
    }

    public Car whichIsMorePowerful() {
        Car powerful = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].getPower() > list[i - 1].getPower()) {
                powerful = list[i];
            }
        }
        return powerful;
    }
}
