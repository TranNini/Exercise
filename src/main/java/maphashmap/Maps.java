package maphashmap;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> empID = new HashMap<>();

        //add value to Map

        empID.put("Phuong", 123);
        empID.put("Jan", 456);
        empID.put("Thanh", 789);
        empID.put("Danilo", 1000);

        System.out.println(empID.values());     //displays int
        System.out.println(empID);
        System.out.println("Phuong: " + empID.get("Phuong"));
        System.out.println(empID.containsKey("Phuong"));
        System.out.println(empID.containsValue(123));
        System.out.println("\n Danilo, du bist gefeuert!");
        empID.remove("Danilo");
        System.out.println(empID);

        empID.put("Thanh", 1000);            //override Thanh
        System.out.println(empID);
        empID.replace("Thanh", 222);         //will only replace the key if exists
        empID.putIfAbsent("Thanh", 222);    //won't change anything. key already exists
        empID.putIfAbsent("Danilo", 666);   //will add key, because it doesn't exist yet
        System.out.println(empID);
    }
}
