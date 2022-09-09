//Solution
import java.lang.StringBuilder;
public class Solution{

    static String toCamelCase(String s){

      
        String camelCaseString;
        StringBuilder sb = new StringBuilder();


        //Algorithm
        //1. Separate each word delimited by -_ into an array
        String[] wordList = s.split("[-_]");

        //2. Make all words uppercase except for the first one
        for(int i =0; i<wordList.length; i++){
            if(i==0) {
                //first word just add as it is
                sb.append((wordList[i]));
            }
            if(i>=1) {
                //check if is uppercase
                if(Character.isUpperCase(wordList[i].charAt(0)))
                {
                //add to sb if it is already uppercase
                sb.append(wordList[i]);
                }
                //check if it is lower case
                if(Character.isLowerCase(wordList[i].charAt(0))) {
                    String tempString = wordList[i].substring(0,1).toUpperCase() + wordList[i].substring(1);
                    sb.append(tempString);
                }

            }
        }
               camelCaseString = sb.toString();
               return camelCaseString;
    }
}




//Nice solution 1
import java.util.Arrays;

class Solution{

  static String toCamelCase(String str){
    String[] words = str.split("[-_]");
    return Arrays.stream(words, 1, words.length)
            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
            .reduce(words[0], String::concat);
  }
}

//Nice solution 2

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution{

  static String toCamelCase(String s){
        String[] stringArray = s.split("[-|_]");

        return stringArray[0] + Arrays.stream(stringArray).skip(1).map(i -> i.substring(0,1).toUpperCase()+i.substring(1))
                .collect(Collectors.joining());
    }
}

//Best codewars solution 

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.StringBuilder;

class Solution{

  static String toCamelCase(String s){
    Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
    StringBuffer sb = new StringBuffer();
    while (m.find()) {
        m.appendReplacement(sb, m.group(1).toUpperCase());
    }
    return m.appendTail(sb).toString();
  }
}




// DESCRIPTION:
// Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).

// Examples
// "the-stealth-warrior" gets converted to "theStealthWarrior"
// "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

// REGULAR EXPRESSIONSALGORITHMSSTRINGS



