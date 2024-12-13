package U6T2_Lab1;

public class ArrayAlgorithms {
    private ArrayAlgorithms(){}
    public static double average (int[] numList) {
        int sum = 0;
        for(int i = 0; i < numList.length; i++) {
            sum += numList[i];
        }
        return (double)sum / numList.length;
    }

    public static int minimum (int[] numList) {
        int min = numList[0];
        for(int i = 0; i < numList.length; i++) {
            if(numList[i] < min) {
                min = numList[i];
            }
        }
        return min;
    }

    public static int howManyContain (String[] strList, String target) {
        int num = 0;
        for(int i = 0; i < strList.length; i++) {
            if(strList[i].contains(target)) {
                num++;
            }
        }
        return num;
    }

    public static String[] stringToArray (String myStr) {
        String[] strList = new String[myStr.length()];
        for(int i = 0; i < myStr.length(); i++) {
            strList[i] = myStr.substring(i, i + 1);
        }
        return strList;
    }

    public static void introduceAdults(Person[] people) {
        for(int i = 0; i < people.length; i++) {
            if(people[i].getAge() >= 18) {
                people[i].introduce();
            }
        }
    }

    public static void reversePrint(String[] wordList) {
        for(int i = wordList.length - 1; i >= 0; i--) {
            System.out.println(new StringBuilder(wordList[i]).reverse().toString());
        }
    }

    public static int[] combine(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        return arr3;
    }

    public static void bookEnd(int[] nums, int num) {
        nums[0] = num;
        nums[nums.length - 1] = num;
    }
  
    public static void multiplyBy(int[] numList, int multiplier) {
        for(int i = 0; i < numList.length; i++) {
            numList[i] = numList[i] * multiplier;
        }
    }
    
    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        int[] newList = new int[numList.length];
        for(int i = 0; i < numList.length; i++) {
            newList[i] = numList[i] * multiplier;
        }
        return newList;
    }

    public static void addExclamation(String[] wordList) {
        for(int i = 0; i < wordList.length; i++) {
            if(!wordList[i].substring(wordList[i].length() - 1, wordList[i].length()).equals("!")) {
                wordList[i] = wordList[i] + "!";
            }
        }
    }
    
    public static boolean[] isFreezing(int[] tempList) {
        boolean[] isFreeze = new boolean[tempList.length];
        for(int i = 0; i < tempList.length; i++) {
            if(tempList[i] <= 32) {
                isFreeze[i] = true;
            } else {
                isFreeze[i] = false;
            }
        }
        return isFreeze;
    }
    
    public static void shiftLeft(int[] numList) {
        int temp = numList[0];
        for(int i = 0; i < numList.length - 1; i++) {
            numList[i] = numList[i + 1];
        }
        numList[numList.length - 1] = temp;
    }
   
    public static void shiftRight(int[] numList) {
        int temp = numList[numList.length - 1];
        for(int i = numList.length - 1; i > 0; i--) {
            numList[i] = numList[i - 1];
        }
        numList[0] = temp;
    }

    public static void reverse(int[] numList) {
        int[] tempList = new int[numList.length];
        int len = numList.length - 1;
        for(int i = 0; i < numList.length; i++) {
            tempList[i] = numList[len - i];  
        }
        for(int i = 0; i < numList.length; i++) {
            numList[i] = tempList[i];
        }
    }
    
    /*public static void reverse(int[] numList) {
        for(int i = 0; i < numList.length / 2; i++) {
            int temp = numList[i];
            numList[i] = numList[numList.length - (1 + i)];
            numList[numList.length - (1 + i)] = temp;
        }
    } */
    
    
}
