package U6T3;

public class ArrayAlgorithms {
    public static String longestString(String[] stringList) {
        // IMPLEMENT ME using an enhanced for loop
        String longest = "";
        for(String string: stringList) {
            if(string.length() >= longest.length()) {
                longest = string;
            }
        }
        return longest;
    }

    public static boolean containsPositive(int[] numList) {
        // IMPLEMENT ME using an enhanced for loop and early return
        for(int num: numList) {
            if(num > 0) {
                return true;
            }
        }
        return false;
    }

    public static String[] makeLowercase(String[] wordList) {
        // IMPLEMENT ME using the most appropriate for loop
        String[] low = new String[wordList.length];
        for(int i = 0; i < wordList.length; i++) {
            low[i] = wordList[i].toLowerCase();
        }
        return low;
    }
    
    public static int endsInExclamations(String[] stringList) {
        // IMPLEMENT ME using the most appropriate for loop
        int num = 0;
        for(String string: stringList) {
            int len = string.length();
            if(string.substring(len - 1, len).equals("!")) {
                num++;
            }
        }
        return num;
    }
    
    /* public static void makeUppercase(String[] wordList) {
        // IMPLEMENT ME using the most appropriate for loop!
        for(int i = 0; i < wordList.length; i++) {
            wordList[i] = wordList[i].toUpperCase();
        }
    } */

    public static void makeUppercase(String[] wordList) {
        String[] upperStrs = new String[wordList.length];
        
        for (int i = 0; i < wordList.length; i++) {
            upperStrs[i] = wordList[i].toUpperCase();
        }

        // set wordList to the newList
        wordList = upperStrs;
    }


    public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
        // IMPLEMENT ME using the most appropriate for loop!
        int[] big = new int[intArr1.length];
        for(int i = 0; i < intArr1.length; i++) {
            if(intArr1[i] > intArr2[i]) {
                big[i] = intArr1[i];
            } else {
                big[i] = intArr2[i];
            }
        }
        return big;
    }
    
    public static int countConsecutiveDoubles(int[] numList) {
        // IMPLEMENT ME using the most appropriate for loop
        int count = 0;
        for(int i = 0; i < numList.length - 1; i++) {
            if(numList[i] == numList[i + 1]) {
                count++;
            }
        }
        return count;
    }
    
    public static int longestStreak(int[] nums) {
        // IMPLEMENT ME using the most appropriate for loop
        int streak = 0;
        int count = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if(count > streak) {
                streak = count;
            }
        }
        return streak;
    }
}
