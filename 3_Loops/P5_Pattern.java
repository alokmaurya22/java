
public class P5_Pattern {

    public static void main(String[] args) {
        int counter = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + counter);
                counter++;
            }
            System.out.println("");
        }
    }
}
