
public class Animal {

    public void eat() {
        System.out.println("Animal is Eating");
    }

    public void sleep() {
        System.out.println("Animal is Sleeping");
    }

    //Private methods does not access by child
    private void secret() {
        System.out.println("This is secret method.");
    }

}
