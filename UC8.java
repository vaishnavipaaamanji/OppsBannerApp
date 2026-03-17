public import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Centralized Pattern Storage
    private static Map<Character, String[]> patternMap = new HashMap<>();

    // Load all character patterns into Map
    private static void loadPatterns() {

        patternMap.put('O', new String[]{
                "*******",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*******"
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                "*******",
                "*      ",
                "*      ",
                "*******",
                "      *",
                "      *",
                "*******"
        });
    }

    // Render Function
    private static void renderBanner(String word) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                } else {
                    line.append("       ").append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        loadPatterns();          // Step 1: Load Map
        renderBanner("OOPS");    // Step 2: Render Word
    }
} {
    
}
