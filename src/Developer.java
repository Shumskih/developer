import java.io.Serializable;

public class Developer implements Serializable {

    private int id;
    private String name;
    private String surname;
    private String specialization;
    private int iDontKnowWhat;
    private int salary;

    Developer(int id, String name, String surname, String specialization, int iDontKnowWhat, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.iDontKnowWhat = iDontKnowWhat;
        this.salary = salary;
    }

    public int getId() {
        System.out.print(this.name + "'s id: ");
        return this.id;
    }

    public String getName() {
        System.out.print("Developer's name: ");
        return this.name;
    }

    public String getSurname() {
        System.out.print(name + "'s surname: ");
        return this.surname;
    }

    public String getSpecialization() {
        System.out.print(this.name + "'s specialization: ");
        return this.specialization;
    }

    public int getIDontKnowWhat() {
        System.out.print(this.name + "'s iDontKnowWhat: ");
        return this.iDontKnowWhat;
    }

    public int getSalary() {
        System.out.print(this.name + "'s salary: $");
        return this.salary;
    }

    public String toString() {
        return "\n" + id + ": " + name + ", " + surname + ", " + specialization + ", " + iDontKnowWhat + ", " + "$" + salary;
    }
}
