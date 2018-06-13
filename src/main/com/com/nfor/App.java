package com.com.nfor;

public class App {

  public static void main(String... args) {
    NFor<Integer> nfor = NFor.of(Integer.class).from(0, 0).by(1, 1).to(5, 3);

    for (Integer[] indices : nfor) {
      System.out.println(java.util.Arrays.toString(indices));
    }
  }

}
