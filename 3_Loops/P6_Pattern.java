
public class P6_Pattern {

    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            int counter = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + counter);
                counter++;
            }
            System.out.println("");
        }
    }
}
