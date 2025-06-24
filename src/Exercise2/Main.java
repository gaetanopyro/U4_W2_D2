package Exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        Random random = new Random();
        int number = 20;

        for (int i = 0; i < number; i++) {
            numberList.add(random.nextInt(101));
        }

        Collections.sort(numberList);
        System.out.println(numberList);

        List<Integer> newList = new ArrayList<>(numberList);
        List<Integer> inversList = new ArrayList<>(numberList);
        Collections.reverse(inversList);
        newList.addAll(inversList);
        System.out.println(inversList);

        boolean pari = true;
        //boolean dispari = false;

        if (pari) {
            for (int i = 0; i < newList.size(); i += 2) {
                System.out.println("posizione" + " " + i + " : " + newList.get(i));
            }
        } else {
            for (int i = 1; i < newList.size(); i += 2) {
                System.out.println("posizione" + " " + i + " : " + newList.get(i));
            }
        }
    }
}
