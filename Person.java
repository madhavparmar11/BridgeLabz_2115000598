class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person() {
        this.name = "No Name";
        this.age = 0;
    }

    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        Person p2 = new Person();
        Person p3 = new Person(p1);
        p1.display();
        p2.display();
    }
}