package exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire un numero per stabilire quante parole occorrono");

        String word = scanner.nextLine();
        int n = Integer.parseInt(word);

        List<String> arrayWords = new ArrayList<>();
        System.out.println("inserisci " + " " + n + " " + "parole");

        for (int i = 0; i < n; i++) {
            String insertWord = scanner.nextLine();
            arrayWords.add(insertWord);
        }

        HashSet<String> duplicateWords = new HashSet<>();
        HashSet<String> singleWords = new HashSet<>();

        for (String insertWord : arrayWords) {
            if (!singleWords.add(insertWord)) {
                duplicateWords.add(insertWord);
            }
        }

        System.out.println("Duplicate Words");
        for (String a : duplicateWords) {
            System.out.println(a);
        }

        System.out.println("Single Words");
        for (String b : singleWords) {
            System.out.println(b);
        }
        scanner.close();
    }
}
