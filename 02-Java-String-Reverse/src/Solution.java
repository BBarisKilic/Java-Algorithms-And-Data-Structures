import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Character> characterList = new ArrayList<Character>();
        StringBuilder stringBuilder = new StringBuilder();
        String s = scan.next();

        for (int i = s.length() - 1; i >= 0; i--) {
            characterList.add(s.charAt(i));
        }

        for (Character character : characterList) {
            stringBuilder.append(character);
        }

        String reversed = stringBuilder.toString();

        if(s.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}