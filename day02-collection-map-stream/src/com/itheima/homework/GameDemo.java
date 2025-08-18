package com.itheima.homework;

import java.util.*;

public class GameDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> pokerCards = new LinkedHashMap<>();
        pokerCards.put(0, "🃏");
        pokerCards.put(1, "🤡");
        String[] colors = {"♥", "♠", "♣", "♦"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int simulateIndex = 2;
        for (String number : numbers) {
            for (String color : colors) {
                pokerCards.put(simulateIndex++, color + number);
            }
        }
        System.out.println(pokerCards);
        Set<Integer> index = pokerCards.keySet();
        LinkedList<Integer> tempIndex = new LinkedList<>();
        tempIndex.addAll(index);
        Collections.shuffle(tempIndex);
        System.out.println(tempIndex);

        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> bottomCard = new TreeSet<>();
        Collections.addAll(bottomCard, tempIndex.get(51), tempIndex.get(52), tempIndex.get(53));
        for (int i = 0; i < tempIndex.size() - 3; i++) {
            if (i % 3 == 0) {
                player1.add(tempIndex.get(i));
            } else if (i % 3 == 1) {
                player2.add(tempIndex.get(i));
            } else {
                player3.add(tempIndex.get(i));
            }
        }
        seeCard(player1, pokerCards);
        seeCard(player2, pokerCards);
        seeCard(player3, pokerCards);
        seeCard(bottomCard, pokerCards);

    }

    public static void seeCard(TreeSet<Integer> player, LinkedHashMap<Integer, String> pokerCards) {
        System.out.print("[");
        for (Integer i : player) {
            System.out.print(pokerCards.get(i) + "\t");
        }
        System.out.println("]");

    }
}
