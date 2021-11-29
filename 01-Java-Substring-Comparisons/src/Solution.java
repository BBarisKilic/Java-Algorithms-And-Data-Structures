import java.util.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        StringBuilder stringBuilder = new StringBuilder();
        List<String> stringList = new ArrayList<String>();
        List<Character> charList = new ArrayList<Character>();

        for(int i = 0; i <= s.length() - k; i++) {
            for(int j = 0; j < k; j++) {
                charList.add(s.charAt(i+j));
            }
            for (Character character : charList) {
                stringBuilder.append(character);
            }
            stringList.add(stringBuilder.toString());
            charList.clear();
            stringBuilder.delete(0, k);
        }

        stringList.sort(Comparator.naturalOrder());
        smallest=stringList.get(0);
        largest=stringList.get(stringList.size()-1);

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}