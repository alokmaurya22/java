//A person class which has properties like name, age and gender. And behaviours like speak(), walk() and eat()

public class Person {

    String name;
    int age;
    String gender;
    int height;
    String eyecolor;

    // creating a static constructor
    public Person() {
        name = "ABC";
        age = 01;
        gender = "Other";
    }

    //Creating a dinamic constructor
    public Person(int height, String eyecolor) {
        System.out.println("Inside the constructo with 3 args");
        this.height = height;
        this.eyecolor = eyecolor;
    }

    public Person(String name, int age, String gender, int height, String eyecolor) {
        this(height, eyecolor);
        System.out.println("Inside the constructo with 5 args");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void speak() {
        System.out.println("Speaking My Details: Name: " + name + " Age: " + age + " Gender: " + gender);
    }

    public void walk() {
        System.out.println("Walking");
    }

    public void eat() {
        System.out.println("Eating");
    }
}
