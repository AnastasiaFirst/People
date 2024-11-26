public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String city;

    public PersonBuilder setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть null или незаполненным");
        }
        this.name = name;
        return this; // Возвращает текущий объект для цепочки вызовов
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Фамилия не может быть null или незаполненной");
        }
        this.surname = surname;
        return this; // Возвращает текущий объект для цепочки вызовов
    }

    public PersonBuilder setAge(Integer age) {
        if (age != null && age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age; // Устанавливает возраст (может быть null)
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Имя и фамилия должны быть заданы");
        }
        return new Person(name, surname, age, city); // Создает и возвращает объект Person
    }
}