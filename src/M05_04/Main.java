package M05_04;

public class Main {
    public static void main(String[] args) {

        Car ford = new Ford ("Mustang", 335, 144, 11500);
        Car mitsubishi = new Mitsubishi ("Minica", 21, 275, 7800);
        Car toyota = new Toyota ("Crown", 115, 155, 14200);
        Car kia = new KIA ("T2000", 80, 177, 8900);

        CarInfo info1 = new CarInfo();
        info1.addToInfoList(ford);
        info1.addToInfoList(toyota);
        info1.addToInfoList(kia);
        info1.addToInfoList(mitsubishi);

        System.out.println("The fastest car of list is: \n" + info1.whichIsFaster());
        System.out.println("The most powerful car of list is: \n" + info1.whichIsMorePowerful());
        System.out.println("The most expensive car of list is: \n" + info1.whichIsMoreExpensive());
    }
}
