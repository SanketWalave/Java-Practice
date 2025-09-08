package collection_march;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * <p>
 * import java.util.*;
 * class Solution {
 * public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
 * String s1="";
 * String s2="";
 * for(int i=l1.size()-1;i>=0;i--)
 * {
 * s1+=l1.get(i);
 * }
 * for(int i=l2.size()-1;i>=0;i--)
 * {
 * s2+=l2.get(i);
 * }
 * System.out.println(s1);
 * System.out.println(s2);
 * return null;
 * }
 * }
 * 708
 */

import java.util.*;

public class LinkedListApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l1 = new LinkedList();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        LinkedList<Integer> l2 = new LinkedList();
        l2.add(5);
        l2.add(6);
        l2.add(4);

        String s1 = "";
        String s2 = "";
        System.out.println(l1);
        System.out.println(l2);
        for (int i = l1.size() - 1; i >= 0; i--) {
            s1 += l1.get(i);
        }
        for (int i = l2.size() - 1; i >= 0; i--) {
            s2 += l2.get(i);
        }
//        long num1=Long.parseLong(s1);
//        long num2=Long.parseLong(s2);
//        long num3=num1+num2;

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        int num3 = num1 + num2;

        System.out.println(num3);
        LinkedList<Integer> l3 = new LinkedList();
        int rev = 0;
        for (; num3 > 0; num3 /= 10) {
            int rem = num3 % 10;
            rev = rev * 10 + rem;
        }
        num3 = rev;
        for (; num3 > 0; num3 /= 10) {
            int rem = num3 % 10;
            l3.add(rem);
        }
        System.out.println(l3);

    }
}
