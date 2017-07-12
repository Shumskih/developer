import java.util.ArrayList;

public class DeveloperTest {
    public static void main (String args[]) {

        DeveloperDAO workingWithFile = new DeveloperDAO();
        ArrayList<Developer> developers = new ArrayList<>();

        Developer igor = new Developer(1, "Igor", "Ivanov", "Java Developer", 3, 3000);
        Developer maxim = new Developer(2, "Maxim", "Hristenko", "Java Developer", 5, 2500);
        Developer andrei = new Developer(3, "Andrei", "Kazachkov", "Java Developer", 2, 3100);
        Developer masha = new Developer(4, "Masha", "Nikolaenko", "Java Developer", 4, 2800);
        Developer sasha = new Developer(5, "Sasha", "Kakasha", "Java Developer", 10, 2950);
        Developer dasha = new Developer(6, "Dasha", "Makasha", "Java Developer", 11, 1010);

        developers.add(igor);
        developers.add(maxim);
        developers.add(andrei);
        developers.add(masha);
        developers.add(sasha);
        developers.add(dasha);

        workingWithFile.saveFile(developers);

        workingWithFile.openFile();


        System.out.println();
        System.out.println(masha.getId());
        System.out.println(masha.getName());
        System.out.println(masha.getSurname());
        System.out.println(masha.getSpecialization());
        System.out.println(masha.getIDontKnowWhat());
        System.out.println(masha.getSalary());
    }
}
