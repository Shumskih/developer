import java.io.*;
import java.util.ArrayList;

public class DeveloperDAO {

    public void saveFile() {

    }

    public void openFile() {
        try ( ObjectInputStream openFile = new ObjectInputStream(new FileInputStream("developers.txt")) ) {

            ArrayList developers2 = (ArrayList) openFile.readObject();
            System.out.println(developers2.toString());

        } catch (ClassNotFoundException e) {
            System.out.println("Файл не найден: " + e);
        } catch (IOException e) {
            System.out.println("При открытии файла произошла ошибка: " + e);
        }
    }

}
