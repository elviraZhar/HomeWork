package lesson5;

public class MainApp5 {

    public static void main(String[] args){
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivan Ivanov", "inginer", "ivanov@maill.ru", "89126435516", 45000, 30);
        persArray[1] = new Person("Saharov Sergey", "smetchik", "saharov@maill.ru", "89125631786", 40000, 40);
        persArray[2] = new Person("Seleznev Pavel", "prorab", "seleznev@maill.ru", "89124568573", 35000, 42);
        persArray[3] = new Person("Vlasov Dmitriy", "rabochiy", "vlasov@maill.ru", "89126534422", 30000, 28);
        persArray[4] = new Person("Login Vladimir", "rabochiy", "login@maill.ru", "89125468823", 30000, 44);

        for (Person c: persArray) {
            if (c.getAge() >= 40) {
            c.info();
            }
        }

    }
}
