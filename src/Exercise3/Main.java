package Exercise3;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();
        System.out.println("coppie di nomi");
        phoneBook.put("Luca", "329898987");
        phoneBook.put("Maria", "3381213145");
        phoneBook.put("Mario", "3342324256");
        System.out.println(phoneBook);
        System.out.println("eliminazione nome");
        phoneBook.remove("Luca");
        System.out.println(phoneBook);

        Set<String> listName = phoneBook.keySet();
        System.out.println(phoneBook);

        for (String name : phoneBook.keySet()) {
            System.out.println("name: " + name);
        }

    }
}
