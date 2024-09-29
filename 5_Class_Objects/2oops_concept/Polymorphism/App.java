
public class App {

    public static void feedAnimal(Animal animal) {
        animal.eat();
    }

    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();
        // Depending on the object we call at run time, it changes its behaviour. So that is calls runtime polymorphism
        a1.eat();
        a2.eat();
        a3.eat();

        feedAnimal(a1);
        feedAnimal(a2);
        feedAnimal(a3);
    }
}
