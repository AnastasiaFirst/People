import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    private Integer age;
    private String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = null; // Возраст неизвестен
    }

    public Person(String name, String surname, Integer age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age; // Возраст известен
        this.city = city;
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age; // Возраст известен
    }

    public boolean hasAge(Integer age) {
        return age != null; // Возвращает true, если возраст известен
    }

    public boolean hasAddress(String city) {
        return city != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return city;
    }

    public void setAddress(String city) {
        this.city = city;
    }

    public void happyBirthday() {
        if (age != null) {
            age++; // Увеличивает возраст на 1
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder childBuilder = new PersonBuilder();
        childBuilder.setSurname(this.surname) // Устанавливает фамилию родителя
                .setAge(0) // Устанавливает возраст ребёнка в 0
                .setAddress(this.city); // Устанавливает адрес родителя
        return childBuilder;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + ", " + getAge() + ", " + getAddress();
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}