package lesson5;

public class Person {
    private final String fullName;
    private final String position;
    private final String emaill;
    private final String phone;
    private final int salary;
    private final int age;

    public Person (String fullName, String position, String emaill, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.emaill = emaill;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public void info() {
        System.out.printf("Сотрудник %s, должность %s, e-maill %s, телефон %s, зарплата %s, возраст %s\n", fullName, position, emaill, phone, salary, age);
    }

}
