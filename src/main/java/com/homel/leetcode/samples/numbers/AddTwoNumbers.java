package com.homel.leetcode.samples.numbers;

/*You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/

public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode solHead = new ListNode(0);
        rec(l1, l2, solHead, 0);
        return solHead.next;
    }

    public void rec(ListNode l1, ListNode l2, ListNode sol, int carry) {
        if (l1 == null && l2 == null) {
            if (carry > 0) {
                sol.next = new ListNode(carry);
            }
            return;
        }

        int val1 = l1 != null ? l1.val : 0;
        int val2 = l2 != null ? l2.val : 0;

        int sum = val1 + val2 + carry;
        sol.next = new ListNode(sum % 10);

        ListNode newListNode1 = l1 != null ? l1.next : null;
        ListNode newListNode2 = l2 != null ? l2.next : null;
        rec(newListNode1, newListNode2, sol.next, sum / 10);
    }



    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(new ListNode(9, new ListNode(1)),
                new ListNode(3, new ListNode(2)));

        System.out.println(result);
    }

}
