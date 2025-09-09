public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this(other.name, other.age);
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        Person original = new Person("Alice", 30);
        Person copy = new Person(original);
        System.out.println(original);
        System.out.println(copy);     
    }
}
