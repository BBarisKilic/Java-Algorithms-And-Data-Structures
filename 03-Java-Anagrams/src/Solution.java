import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        String lowerCaseA = a.toLowerCase();
        String lowerCaseB = b.toLowerCase();
        Map<Character, Integer> aMap = new HashMap<Character, Integer>();
        Map<Character, Integer> bMap = new HashMap<Character, Integer>();

        if(lowerCaseA.length() > 50 || lowerCaseA.length() < 1 || lowerCaseB.length() > 50 || lowerCaseB.length() < 1) {
            return false;
        }

        for (Character character : lowerCaseA.toCharArray()) {
            if(aMap.containsKey(character)) {
                aMap.replace(character, aMap.get(character)+1);
            } else {
                aMap.put(character, 1);
            }
        }

        for (Character character : lowerCaseB.toCharArray()) {
            if(bMap.containsKey(character)) {
                bMap.replace(character, bMap.get(character)+1);
            } else {
                bMap.put(character, 1);
            }
        }

        if(aMap.size() == bMap.size()) {
            for (Character character: aMap.keySet()) {
                if(!bMap.containsKey(character)) {
                    return false;
                }
                if(!bMap.get(character).equals(aMap.get(character))) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
