import java.io.Serializable;

public class Developer  implements Serializable {

    private int id;
    private String name;
    private String surname;
    private String specialization;
    private int iDontNoWhat;
    private int salary;

    Developer(int id, String name, String surname, String specialization, int iDontNoWhat, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.iDontNoWhat = iDontNoWhat;
        this.salary = salary;
    }

    public String toString() {
        return "\n" + id + ", " + name + ", " + surname + ", " + specialization + ", " + iDontNoWhat + ", " + "$" + salary;
    }
}
