import java.util.HashSet;
import java.util.Set;

public class PangramCheck {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(input)); 
    }

    public static boolean isPangram(String s) {
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                set.add(Character.toLowerCase(c));
            }
        }

        return set.size() == 26;
    }
}
