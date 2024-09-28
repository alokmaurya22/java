// Creating a object of person

public class Person_Creator {

    public static void main(String[] args) {
        //Creating a person object
        Person person = new Person();

        person.name = "Alok";
        person.age = 23;
        person.gender = "Male";
        System.out.println(person);
        person.walk();
        person.eat();
        person.speak();
        // another object
        Person person2 = new Person();
        person2.walk();
        person2.eat();
        person2.speak();

        //creating through static constructor
        Person p3 = new Person();
        System.out.println(p3);
        Person p4 = new Person();
        System.out.println(p4);
        Person p5 = new Person();
        System.out.println(p5);

        p3.speak();
        p4.speak();
        p5.speak();

        // creating through dinamic constructor
        Person p6 = new Person("Alokp6", 236, "Malep6", 34, "Green");
        System.out.println(p6);

        Person p7 = new Person("Alokp7", 237, "Malep7", 12, "Blue");
        System.out.println(p7);

        Person p8 = new Person("Alokp8", 238, "Malep8", 34, "Yellow");
        System.out.println(p8);

        p6.speak();
        p7.speak();
        p8.speak();
    }
}
