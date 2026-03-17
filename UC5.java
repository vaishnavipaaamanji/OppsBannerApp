public public class UC5 {

    public static void main(String[] args) {

        int h = 7;   // height
        int w = 7;   // width

        for (int i = 0; i < h; i++) {

            // -------- O --------
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == h - 1 || j == 0 || j == w - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            // -------- O --------
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == h - 1 || j == 0 || j == w - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            // -------- P --------
            for (int j = 0; j < w; j++) {
                if (j == 0 ||
                    (i == 0 && j < w - 1) ||
                    (i == h / 2 && j < w - 1) ||
                    (j == w - 1 && i > 0 && i < h / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            // -------- S --------
            for (int j = 0; j < w; j++) {
                if (i == 0 ||                     // top line
                    i == h / 2 ||                // middle line
                    i == h - 1 ||                // bottom line
                    (j == 0 && i < h / 2) ||    // upper left
                    (j == w - 1 && i > h / 2))  // lower right
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
} {
    
}
