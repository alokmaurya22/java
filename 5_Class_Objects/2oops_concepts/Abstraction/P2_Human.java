
public interface P2_Human {

    void spek();

    void eat();

    // Default method
    default void dance() {
        System.out.println("Human dances default!");
    }

    // Static method
    static void play() {
        System.out.println("Human playig  is good for the body!");
    }
}
