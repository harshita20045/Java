package functionalInterface;


interface CharacterCounter {
    int count(String str, char ch);
}

public class Occurence {
    public static void main(String[] args) {
        CharacterCounter c = (str, ch) -> {
            int count = 0;
            for (char i : str.toCharArray()) {
                if (i == ch) 
                {count++;}
            }
            return count;
        };

        String s = "hello world";
        char cha= 'o';

        System.out.println("Occurrences of " +cha + " in " +s+" is " + c.count(s, cha));
    }
}


