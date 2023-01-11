import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            Student student = new Student();
            System.out.println("Upisi ime:");
            String ime = sc.next();
            if (ime.equals("quit")) {
                break;
            }
            System.out.println("Upisi prezime:");
            String prezime = sc.next();
            if (prezime.equals("quit")) {
                break;
            }
            System.out.println("Upisi ocenu:");
            int ocena = sc.nextInt();
            String strOcena = String.valueOf(ocena);

            if (strOcena.equals("quit")) {
                break;
            }
            student.ime = ime;
            student.prezime = prezime;
            student.ocena = ocena;
            list1.add(student);
        }
        for (Student ispis : list1) {
            System.out.println(ispis.ime + " " + ispis.prezime + " " + ispis.ocena);

        }
        System.out.println("***********************************");
        for (Student polozio : list1) {
            if (polozio.ocena > 5) {
                list2.add(polozio);
                System.out.println(polozio.ime + " " + polozio.prezime + " " + polozio.ocena);
            }
        }
    }
}



