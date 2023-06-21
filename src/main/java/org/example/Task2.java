package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    /**
     * Учитывая строку s, содержащую только символы '(', ')', '{', и '}', определите, допустима ли входная строка.'['']'
     * Входная строка действительна, если:
     * Открытые скобки должны быть закрыты однотипными скобками.
     * Открытые скобки должны быть закрыты в правильном порядке.
     * Каждой закрывающей скобке соответствует открытая скобка того же типа.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        System.out.println("validString(string) = " + validString(string));
        scan.close();
    }

    /**
     * @apiNote Учитывая строку s, содержащую только символы '(', ')', '{', и '}', определите, допустима ли входная строка.
     * @param string
     * @return true/false
     */
    private static boolean validString(String string) {
        String open  = "({";
        String close = ")}";
        boolean result = true;
        Deque<Character> deque = new ArrayDeque<>();
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            if (open.indexOf(ch) >= 0) {
                deque.offerFirst(ch);
            }
            else {
                int index = close.indexOf(ch);
                if (index >= 0) {
                    if (deque.size() == 0 || deque.pollFirst() != open.charAt(index)) {
                        result = false;
                        break;
                    }
                }
            }
            if (!result)
                break;
        }
        return result;
    }

}
