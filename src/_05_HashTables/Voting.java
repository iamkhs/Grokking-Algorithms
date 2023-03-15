package _05_HashTables;

import java.util.HashMap;

public class Voting {
    public static void main(String[] args) {
        HashMap<String, Boolean> voted = new HashMap<>();
        checkVoter(voted,"tom");
        checkVoter(voted,"mike");
        checkVoter(voted,"tom");
    }

    private static void checkVoter(HashMap<String, Boolean> voted,String name){
        if (voted.containsKey(name) && voted.get(name)){
            System.out.println("Kick them out!");
        }
        else{
            voted.put(name, true);
            System.out.println("let them vote");
        }
    }
}
