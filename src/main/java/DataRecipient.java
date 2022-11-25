import java.io.FileNotFoundException;
import java.util.Scanner;
//Фамилия Имя Отчество датарождения номертелефона пол
public class DataRecipient {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("surname name patronymic birthday phoneNumber gender");
        DataRecipient dataRecipient = new DataRecipient();
        SavePerson savePerson = new SavePerson();
        Person person = dataRecipient.getData();
        savePerson.savePerson(person);

    }
    public Person getData() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] info = str.split(" ");

        if(info.length>6) throw new RuntimeException("non-corrective input ... > 6");
        else if(info.length<6) throw new RuntimeException("non-corrective input ... < 6");

        Person person = new Person();
        person.setName(info[0]);
        person.setSurname(info[1]);
        person.setPatronymic(info[2]);
        person.setBirthday(info[3]);
        person.setPhoneNumber(Long.parseLong(info[4]));
        person.setGender(info[5].charAt(0));

        return person;
    }
}
