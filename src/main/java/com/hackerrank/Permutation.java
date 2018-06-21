package com.hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Permutation {

  public static void main(String[] args) throws IOException {
    buildSubsequences("abc");
    /*a, ab, abc, ac, b, bc, c */
  }
  
  static String[] buildSubsequences(String s) {
    List<String> list = new ArrayList<String>();
    list = getWords(list, s, 0);
    System.out.println(list);
    String[] myArray = new String[list.size()];
    return getArrayFromList(list, myArray, 0);
  }
  
  private static List<String> getWords(List<String> list, String s, int i) {
      if (i > s.length()-1) {
        return addWord(s,list);
      } else {
        StringBuilder sb = new StringBuilder(s);
        String word = sb.deleteCharAt(i).toString();
        list = addWord(word,list);
        String word2 = String.valueOf(s.charAt(i));
        list = addWord(word2,list);
        return getWords(list, s, i + 1);
      }
  }
  
  private static List<String> addWord(String word,List<String> list){
    if (!list.contains(word))
      list.add(word);
    return list;
  }
  
   private static String[] getArrayFromList(List<String> list, String[] array, int control) {
    if (control > list.size() - 1) {
      return array;
    } else {
      array[control] = list.get(control);
      return getArrayFromList(list, array, control + 1);
    }
  }

}
