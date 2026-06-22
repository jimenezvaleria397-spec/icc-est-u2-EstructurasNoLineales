package models;

public class Person implements Comparable <Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    @Override
    public int compareTo(Person otra){
        int comAge = Integer.compare(this.age, otra.getAge());

        if (compAge != 0)
            return compAge;

        return this.name.compareTo(otra.getNombre());
    }
}
