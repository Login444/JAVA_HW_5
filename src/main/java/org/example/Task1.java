package org.example;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

// Вывести список на экран в перевернутом виде (без массивов и ArrayList)
public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        createLinkedList(list);
        System.out.println(list);
        System.out.println("reverseList(list) = " + reverseList(list));
    }

    /**
     * @apiNote reverse list
     * @param list
     * @return reverse
     */
    private static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reverse = new LinkedList<>();
        while (list.size() != 0){
            reverse.addLast(list.pollLast());
        }
        return reverse;
    }

    /**
     * @apiNote create Linked List
     * @param list
     * @return Linked List
     */
    private static LinkedList<Integer> createLinkedList(LinkedList<Integer> list) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите колличество элементов списка");
        int n = scan.nextInt();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(i, random.nextInt(1,10));
        }
        return list;
    }
}