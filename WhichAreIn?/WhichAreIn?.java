//Solution 1

import java.util.Arrays;

public class WhichAreIn { 
  
  public static String[] inArray(String[] array1, String[] array2) {
     Arrays.sort(array1);
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            String s1 = array1[i];
            boolean flag = false;
            for (String s2 : array2) {
                if (s2.contains(s1)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                array1[count] = s1;
                count++;
            }
        }

        String[] arr = new String[count];
        System.arraycopy(array1, 0, arr, 0, count);
        return arr;
  }
}

//Solution 2

import java.util.*;

public class WhichAreIn {   
 public static String[] inArray(String[] array1, String[] array2) {
      return Arrays.stream(array1).filter(word -> (Arrays.stream(array2).anyMatch(e -> e.indexOf(word) > -1 ))).sorted().toArray(String[]::new);
  }
}
