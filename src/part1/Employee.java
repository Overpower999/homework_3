package part1;

public class Employee {
    private final String name;
    private final String lastname;
    private final String surname;
    private final String position;

    private final String email;
    private final long phone;
    private final int age;

    public Employee(String name, String lastname, String surname, String position, String email, long phone, int age) {
        this.name = name;
        this.lastname = lastname;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

}
