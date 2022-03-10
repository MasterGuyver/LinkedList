package com.demo;

public class Main {

    public static void main(String[] args) {
	  LinkedList list = new LinkedList();
	  list.add(Integer.valueOf(1));
	  list.add(Integer.valueOf(3));
	  list.add(Integer.valueOf(5));
      list.add(Integer.valueOf(3));
      list.add(Integer.valueOf(10));
      list.add(Integer.valueOf(7));
      for(int i = 0; i<list.size(); i++)
      {
          System.out.print(list.get(i));
          System.out.print(" ");
      }
    }
}
