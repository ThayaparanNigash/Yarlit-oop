import java.util.Scanner;
import Student4.Student4;
public class MainStudent4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = input.nextInt();

        input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        Student s = new Student(id, name, new int[3]);

        s.setMarks(input);

        s.Display();

        input.close();
    }
}