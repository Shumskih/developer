import java.io.*;
import java.util.ArrayList;

public class DeveloperTest {
    public static void main (String args[]) {

        DeveloperDAO openFile = new DeveloperDAO();

        try ( ObjectOutputStream saveFile = new ObjectOutputStream(new FileOutputStream("developers.txt")) ){

            ArrayList developers = new ArrayList();

            Developer igor = new Developer(1, "Igor", "Ivanov", "Java Developer", 3, 3000);
            Developer maxim = new Developer(2, "Maxim", "Hristenko", "Java Developer", 5, 2500);
            Developer andrei = new Developer(3, "Andrei", "Kazachkov", "Java Developer", 2, 3100);
            Developer masha = new Developer(4, "Masha", "Nikolaenko", "Java Developer", 4, 2800);

            developers.add(igor);
            developers.add(maxim);
            developers.add(andrei);
            developers.add(masha);


            saveFile.writeObject(developers);

        } catch (IOException e) {
            System.out.println("Не могу сохранить файл: " + e);
        }

        openFile.openFile();
    }
}
