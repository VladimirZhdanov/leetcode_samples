package com.homel.leetcode.samples;

public class MyLinkedList {

    Node firstNode;
    Node lastNode;
    int size = 0;

    private int getLastIndex() {
        if (size == 0) return 0;
        return size - 1;
    }

    /** Initialize your data structure here. */
    public MyLinkedList() {
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index > getLastIndex() || index < 0 || size == 0) return -1;
        if (index == getLastIndex() && size > 0) return lastNode.val;
        if (index == 0 && size > 0) return firstNode.val;
        Node result = firstNode;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node temp = firstNode;
        firstNode = new Node(val, temp, null);
        if (temp == null) {
            lastNode = firstNode;
        } else {
            temp.prev = firstNode;
        }

        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node temp = lastNode;
        lastNode = new Node(val, null, temp);
        if (temp == null) {
            firstNode = lastNode;
        } else {
            temp.next = lastNode;
        }
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index == size) {
            addAtTail(val);
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node result = firstNode;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        Node temp = result;
        result = new Node(val, temp, temp.prev);
        temp.prev.next = result;
        temp.prev = result;
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index > getLastIndex() || index < 0) return;

        if (index == getLastIndex()) {
            removeLast();
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }

        Node result = firstNode;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }

        result.prev.next = result.next;
        result.next.prev = result.prev;
        size--;
    }

    public void removeFirst() {
        if (size > 0) {
            firstNode = firstNode.next;
            size--;
        }
    }

    public void removeLast() {
        if (size > 0) {
            lastNode = lastNode.prev;
            size--;
        }
    }
}

class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val, Node next, Node prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
