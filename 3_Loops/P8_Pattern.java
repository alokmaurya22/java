
public class P8_Pattern {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            int counter = 1;
            for (int j = 0; j < 4; j++) {
                if (i + j >= 3) {
                    System.out.print(" " + counter);
                    counter++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
