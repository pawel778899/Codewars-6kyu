import java.util.Arrays;
 public class Kata {
    public static double findUniq(double arr[]) {     
      
      Arrays.sort(arr);   
      if (arr[0] != arr[1]){
        return arr[0];
      }
      else {
        return arr[arr.length-1];
      }
    }
}


// DESCRIPTION:
// There is an array with some numbers. All numbers are equal except for one. Try to find it!

// Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
// Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
// It’s guaranteed that array contains at least 3 numbers.

// The tests contain some very huge arrays, so think about performance.

// This is the first kata in series:

// Find the unique number (this kata)
// Find the unique string
// Find The Unique
// FUNDAMENTALS ALGORITHMS ARRAYS
