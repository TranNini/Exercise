package maphashmap;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> empID = new HashMap<>();

        //add value to Map

        empID.put("Phuong", 123);
        empID.put("Jan", 456);
        empID.put("Thanh", 789);

        System.out.println(empID);
        System.out.println("Phuong: " + empID.get("Phuong"));
    }
}
