import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SavePerson {
    public void savePerson(Person person) {
        File file = new File(person.getSurname());
        try(PrintWriter printWriter = new PrintWriter(new FileOutputStream(file,true))) {
            printWriter.println(person.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
