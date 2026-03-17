public public class UC6 {

    // ----- Static Function for O -----
    static String[] getO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // ----- Static Function for P -----
    static String[] getP() {
        return new String[]{
            "****** ",
            "*     *",
            "****** ",
            "*      ",
            "*      "
        };
    }

    // ----- Static Function for S -----
    static String[] getS() {
        return new String[]{
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        // Print Banner : OOPS
        for (int i = 0; i < O.length; i++) {
            System.out.println(
                    O[i] + "  " +   // O
                    O[i] + "  " +   // O
                    P[i] + "  " +   // P
                    S[i]            // S
            );
        }
    }
} {
    
}
