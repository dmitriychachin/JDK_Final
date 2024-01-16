package org.example;

import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String>card = new HashMap<>();
        card.put(1, "Умпа - лумпа");
        card.put(2, "Ио - мио");
        card.put(3, "Краш - баш");
        card.put(4, "Пум - пурум");
        card.put(5, "Фантазия закончилась и мультики тоже");

        System.out.println(card.get(random()));
    }

    public static int random() {
        int number = new Random().nextInt(1,5);
        return number;
    }
}