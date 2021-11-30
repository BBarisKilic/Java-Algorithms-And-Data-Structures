import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if(s.isBlank()) {
            System.out.println("0");
            System.exit(0);
        }

        s = s.trim();
        String[] strings = s.split("\\s*[^a-zA-Z]+\\s*");

        System.out.println(strings.length);
        for (String string: strings) {
            System.out.println(string);
        }

        scan.close();
    }
}