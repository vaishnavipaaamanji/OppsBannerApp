public class UC2 {
import java.util.HashMap;
import java.util.Map;

public class UC2 {

    private Map<Character, String[]> patternMap;

    public UC2() {
        patternMap = new HashMap<>();
        initializePatterns();
    }

    private void initializePatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    public void printBanner(String text) {

        text = text.toUpperCase();

        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);

                if (patternMap.containsKey(ch)) {
                    System.out.print(patternMap.get(ch)[row] + "  ");
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }

    // ✅ MAIN METHOD HERE
    public static void main(String[] args) {
        UC2 bannerApp = new UC2();
        bannerApp.printBanner("OOPS");
    }
}