import java.util.Scanner;
import packStudent3.Student3;
public class MainStudent3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = input.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter Subject " + (i + 1) + " Marks: ");
            marks[i] = input.nextInt();
        }

        Student3 s4 = new Student3(id, name);

        s4.setmarks(marks);
        s4.display();

        input.close();
    }
}

