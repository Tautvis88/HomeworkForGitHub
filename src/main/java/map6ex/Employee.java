package map6ex;

public class Employee {

    private String name;
    private String surname;
    private int ssn;
    private int age;

    public Employee() {

    }

    public Employee(String name, String surname, int ssn, int age) {
        this.name = name;
        this.surname = surname;
        this.ssn = ssn;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EMPLOYEE: " + String.format("%-15s", (name + " " + surname + ",")) + " SSN " + ssn +
                          ", age " + age + " years.";
    }
}
