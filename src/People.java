public class People {
    private int age;
    private String name;
    private String lastName;
    private String GREET = "Hello";

    public People(int age, String name, String lastName) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
    }

    public String greet(){
        return GREET + " my name is " + name + " " + lastName;
    }
}