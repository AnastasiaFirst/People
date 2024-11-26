import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testPersonCreationWithAgeAndCity() {
        Person person = new Person("Анна", "Вольф", 31, "Сидней"); //Проверка на правильность работы конструктора
        assertEquals("Анна", person.getName());         //Ожидаем положительный результат
        assertEquals("Вольф", person.getSurname());     //Ожидаем положительный результат
        assertEquals(31, person.getAge());              //Ожидаем положительный результат
        assertEquals("Сидней", person.getAddress());    //Ожидаем положительный результат
    }

    @Test
    void happyBirthdayTest() {
        Person person = new Person("Анна", "Вольф", 31);
        person.happyBirthday(); //Проверка на правильность расчета возраста Анны
        assertEquals(32, person.getAge()); //Ожидаем положительный результат
    }
}