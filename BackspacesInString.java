public class BackspacesInString {

    public String cleanString(String s) {
        char[] letters = s.toCharArray();
        int flag = 0;
        String result = "";
        for (int i = letters.length - 1; i >= 0; i--) {
            if (letters[i] == '#') {
                letters[i] = '@';
                flag++;
            } else if (letters[i] != '#' && flag != 0) {
                letters[i] = '@';
                flag--;
            }
        }
        for (int j = 0; j < letters.length; j++) {
            if (letters[j] != '@') {
                result = result + letters[j];
            }
        }
        return result;
    }
  
  
// DESCRIPTION:
// Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"

// Your task is to process a string with "#" symbols.

// Examples
// "abc#d##c"      ==>  "ac"
// "abc##d######"  ==>  ""
// "#######"       ==>  ""
// ""              ==>  ""
// FUNDAMENTALS STRINGS ALGORITHMS
  
