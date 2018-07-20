package lesson3.practice_3.task3;

public class Dog {
    private String name;
    private String color;
    private int age;

    // void dog(String newName, String newColor, int newAge) {
    //    name = newName;
    //    color = newColor;
    //    age = newAge;
    // }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    void sleep() {
        System.out.println("Zzzzzz-zzzzz-zzz-zzzzz-zzz-zz-z");
    }

    void eat() {
        System.out.println("hrum-hrum-hrum-hrum-hrum");
    }
}
