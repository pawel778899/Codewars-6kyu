//Solution 1

import java.util.*;

public class BallotsCounter {

    public static String getWinner(final List<String> listOfBallots) {
      int n = listOfBallots.size();
      
      Set<String> unique = new HashSet<String>(listOfBallots);
      for (String key : unique) {
        if ( Collections.frequency(listOfBallots, key) > n/2){
          return key;
        }
      }
    
    return null;
    }
}

//Solution 2

import java.util.List;
import java.util.HashSet;
import java.util.Collections;

public class BallotsCounter {

    public static String getWinner(final List<String> listOfBallots) {
      HashSet<String> unique = new HashSet<String>(listOfBallots);
      for (String n : unique) {
        if (Collections.frequency(listOfBallots, n) > listOfBallots.size()/2) return n;
      }
      return null;
    }

}

//Soltuion 3

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class BallotsCounter {
    public static String getWinner(final List<String> listOfBallots) {
       Map<String, Long> counts = listOfBallots.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       return counts.entrySet().stream().filter(e -> e.getValue() > listOfBallots.size() / 2)
                .map(Map.Entry::getKey).findFirst().orElse(null);         
    }
}
