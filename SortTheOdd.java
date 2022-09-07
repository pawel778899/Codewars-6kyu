import java.util.Arrays;

public class Kata {
public static int[] sortArray(int[] array) {
    int i;
    int n;
    int m;
    int temp = 0;
    if (array.length < 2) {
        System.out.println(Arrays.toString(array));
        return array;
    }

    for (i = 0; i < array.length; i++) {
        for (n = 0; n < array.length; n++) {
            if (array[n] % 2 != 0) {
                for (m = n + 1; m < array.length; m++) {
                    if (array[m] % 2 != 0) {
                        if (array[n] > array[m]) {
                            temp = array[n];
                            array[n] = array[m];
                            array[m] = temp;
                        }
                        break;
                    }
                }
            }
        }
    }
    System.out.println(Arrays.toString(array));
    return array;
}
}
    
    



// DESCRIPTION:
// Task
// You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.

// Examples
// [7, 1]  =>  [1, 7]
// [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
// [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
// FUNDAMENTALS ARRAYS SORTING
    
