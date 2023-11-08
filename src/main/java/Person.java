public class Person {
    String name;
    int age;
    char gender;

    Person(String name,int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

        introduction();
    }
    public void introduction() {
        System.out.println("Hallo, ich bin " + name + " und " + age + " Jahre alt.");
    }
}
