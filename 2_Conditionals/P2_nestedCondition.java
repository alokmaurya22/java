
public class P2_nestedCondition {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 6;
        if (a >= b) {
            if (a > c) {
                System.out.println("a is greater");
            } else {
                System.out.println("c is greater");
            }
        } else {
            if (b > c) {
                System.out.println("b is greater");
            } else {
                System.out.println("c is greater");
            }
        }

    }
}
