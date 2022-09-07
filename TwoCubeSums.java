import java.util.*;

public class Kata {

    public static boolean hasTwoCubeSums(int n) {

        int counter =0;
        int border = (int) Math.pow(n, 1.0 / 3);

        List<Integer> numbers = new ArrayList<>();
        for(int i =1; i <= border; i++){
            numbers.add(i);
        }
        for( int a = 0; a<numbers.size(); a++ ){
            for( int b = a+1; b<numbers.size(); b++ ){
                Double tempSum = Math.pow(numbers.get(a),3) + Math.pow(numbers.get(b),3);
                if(tempSum==n){
                    counter++;
                }
            }
        }
        if( counter>1 ){
            return  true;
        }
        return  false;
    }
}




// DESCRIPTION:
// Create a function

// boolean hasTwoCubeSums(int n)
// which checks if a given number n can be written as the sum of two cubes in two different ways: n = a³+b³ = c³+d³. All the numbers a, b, c and d should be different and greater than 0.

// E.g. 1729 = 9³+10³ = 1³+12³.

// hasTwoCubeSums(1729); // true
// hasTwoCubeSums(42);   // false
// FUNDAMENTALS
