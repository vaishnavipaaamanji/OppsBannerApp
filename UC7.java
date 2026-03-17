public public class UC7 {

    // Static Inner Class to store Character and its Pattern
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        int height = 7;

        // Create Pattern Objects
        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                "*******",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*******"
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                "*******",
                "*      ",
                "*      ",
                "*******",
                "      *",
                "      *",
                "*******"
        });

        // Store all characters in array
        CharacterPatternMap[] banner = {O, O, P, S};

        // Print Horizontally using StringBuilder
        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : banner) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
} {
    
}
