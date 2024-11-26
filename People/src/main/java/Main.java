public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setAge(9)
                .build();
        System.out.println("У " + mom + "," + " есть сын, " + son);

        try {
            Person dad = new PersonBuilder()
                    .setName("Петр")
                    .setSurname("Дятел")
                    .setAge(41)
                    .setAddress("Вологда")
                    .build();
            Person daughter = dad.newChildBuilder()
                    .setName("Людмила")
                    .setAge(15)
                    .build();
            System.out.println("У " + dad + "," + " есть дочь, " + daughter);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}