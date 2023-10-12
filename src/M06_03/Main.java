package M06_03;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Friends friendsList01 = new Friends();

        friendsList01.friends.add("Павло");
        friendsList01.friends.add("Юлія");
        friendsList01.friends.add("Денис");
        friendsList01.friends.add("Тетяна");
        friendsList01.friends.add("Антон");
        friendsList01.friends.add("Сергій");
        friendsList01.friends.add("Ольга");
        friendsList01.friends.add("Андрій");
        friendsList01.friends.add("Віталій");

        System.out.println(friendsList01.friends);

        Collections.sort(friendsList01.friends);

        System.out.println(friendsList01.friends);
    }
}
