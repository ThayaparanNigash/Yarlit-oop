package Student4;
public class Student4 {

    private int id;
    private String name;
    private int[] marks;

    public Student(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void setMarks(Scanner input) {

        marks = new int[3];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter Marks " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }
    }

    private int Clactotal() {

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }

        return total;
    }

    private double calcavg() {
        return (double) Clactotal() / marks.length;
    }

    private char getresult(double average) {

        char result = '\u0000';

        if (average > 75) {
            result = 'A';
        }
        else if (average > 65) {
            result = 'B';
        }
        else if (average > 55) {
            result = 'C';
        }
        else if (average > 45) {
            result = 'D';
        }
        else {
            result = 'F';
        }

        return result;
    }

    public void Display() {

        System.out.println();
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Total: " + Clactotal());
        System.out.println("Average: " + calcavg());
        System.out.println("Result: " + getresult(calcavg()));
    }
}