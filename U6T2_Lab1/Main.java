package U6T2_Lab1;

public class Main {
    public static void main(String[] args) {
        String[] words1 = {"yo", "what", "nice", "dude"};
        ArrayAlgorithms.addExclamation(words1);
        for (int i = 0; i < words1.length; i++) {
            System.out.print(words1[i] + " " );
        }
        System.out.println();
        String[] words3 = {"yo!", "what!", "nice!", "dude!"};
        ArrayAlgorithms.addExclamation(words3);
        for (int i = 0; i < words3.length; i++) {
            System.out.print(words3[i] + " " );
        }
        System.out.println();
        String[] words2 = {"a!bc", "!abc", "ab!c", "!abc"};
        ArrayAlgorithms.addExclamation(words2);
        for (int i = 0; i < words2.length; i++) {
            System.out.print(words2[i] + " " );
        }
        System.out.println();
        String[] words4 = {"hello!!", "hola!", "hi", "what?", "rain!", "shine", "out!"};
        ArrayAlgorithms.addExclamation(words4);
        for (int i = 0; i < words4.length; i++) {
            System.out.print(words4[i] + " " );
        }
        
    }
}
