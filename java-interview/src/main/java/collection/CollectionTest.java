package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    List<Double> res = null;
    for(Integer i : input){
      Double T = Math.pow(((i*2)+3),5);
      res.add(T);
    }
    return res;
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    List<String> res = new ArrayList<>();
    StringBuilder t= new StringBuilder();
    for(String s : input){
     t.append(s);
    }
    String b =t.toString();
    for(int j =0; j<2; j++) {
      for (int i = 0; i < b.length(); i++) {
        if (i == 0) res.add(String.valueOf(b.charAt(i)).toUpperCase());
        else res.add(String.valueOf(b.charAt(i)));
      }
    }
    return res;
  }

}
