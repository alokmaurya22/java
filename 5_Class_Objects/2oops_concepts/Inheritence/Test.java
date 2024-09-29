
public class Test {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        // d.secret() // Private methods of parent class

        Animal a = new Animal();
        a.eat();
        //a.bark(); // Child method does not comes in parent

        Parrot p = new Parrot();
        System.out.println(p.Country);
    }
}
