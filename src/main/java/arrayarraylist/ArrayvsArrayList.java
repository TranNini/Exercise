package arrayarraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayvsArrayList {
    public static void main(String[] args) {
        String[] friendsArray = new String[4];
        String[] friendsArray2 ={"Phuong", "Jan", "Yasemin", "Nini"};

        System.out.println(Arrays.toString(friendsArray2));
        System.out.println(friendsArray2.length);

        ArrayList<String> friendArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("Phuong", "Jan", "Yasemin", "Nini"));

        System.out.println(friendsArrayList2);
        System.out.println(friendsArrayList2.size());

    }
}
