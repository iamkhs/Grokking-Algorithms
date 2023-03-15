package _05_HashTables;

import java.util.HashMap;

public class HashTables {
    public static void main(String[] args) {
        HashMap<String, Integer> phoneBooks = new HashMap<>();
        phoneBooks.put("jenny",423432);
        phoneBooks.put("emergency", 911);

        System.out.println(phoneBooks.get("jenny"));
        System.out.println(phoneBooks.get("emergency"));
    }
}
