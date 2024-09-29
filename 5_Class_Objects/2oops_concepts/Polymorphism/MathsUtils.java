
public class MathsUtils {

    // two methods with same name and diffrent parameter [METHODE OVERLOADING]
    int add(int a, int b) {
        return a + b;
    }

    int add(double a, int b) {
        return (int) a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MathsUtils mathsutil = new MathsUtils();
        mathsutil.add(10, 20);
        mathsutil.add(23.5, 29);
        mathsutil.add(10, 20, 30);
    }
}
