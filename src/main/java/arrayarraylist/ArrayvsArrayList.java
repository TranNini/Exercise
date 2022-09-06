package arrayarraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayvsArrayList {
    public static void main(String[] args) {
        //fixed size
        String[] friendsArray = new String[4];
        //fixed size implied through values
        String[] friendsArray2 = {"Phuong", "Jan", "Yasemin", "Nini"};

        System.out.println("Array:");
        System.out.println(Arrays.toString(friendsArray2));
        System.out.println("size: " + friendsArray2.length);

        //set element, value of 0 got changed
        friendsArray2[0] = "Thanh Phuong";
        System.out.println("set: " + friendsArray2[0]);
        System.out.println(Arrays.toString(friendsArray2));
        System.out.println();

        //remove, not possible

        ArrayList<String> friendArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("Phuong", "Jan", "Yasemin", "Nini"));

        //add element, can't be done in Array
        friendsArrayList2.add("Dog");

        System.out.println("ArrayList:");
        System.out.println(friendsArrayList2);
        System.out.println("size: " + friendsArrayList2.size());

        //set element
        friendsArrayList2.set(0,"Pupsi");
        System.out.println("set: " + friendsArrayList2.get(0));

        //remove element
        friendsArrayList2.remove("Dog");
        friendsArrayList2.remove(3);

        System.out.println("after removal: " + friendsArrayList2);
    }
}
