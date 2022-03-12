package com.demo;

public class LinkedList {
    private Node beg;

    public LinkedList() {
        beg = null;
    }

    public void add(Integer data) {
        if(beg == null) {
            beg = new Node();
            beg.setData(data);
            beg.setNext(null);
        }
        else {
            Node current = beg;
            Node next = beg.getNext();
            while(next != null) {
                current = next;
                next = next.getNext();
            }
            next = new Node();
            next.setData(data);
            next.setNext(null);
            current.setNext(next);
        }
    }

    public Integer get(int index) {
        Node current = beg;
        for(int i = 0; i<index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    public boolean delete(int index) {
        boolean flag = false;
        if(index == 0) {
            beg = beg.getNext();
            flag = true;
        }
        else {
            Node current = beg;
            Node next = beg.getNext();
            for (int i = 0; i < index - 1 && next != null; i++) {
                current = next;
                next = current.getNext();
            }
            if (next != null) {
                current.setNext(next.getNext());
                next = null;
                flag = true;
            }
        }
        return flag;
    }

    public int size() {
        int i = 0;
        Node current = beg;
        do {
          current = current.getNext();
          ++i;
        } while(current != null);
        return i;
    }
}
