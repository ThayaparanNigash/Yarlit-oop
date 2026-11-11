class MainStudent2 {
    public static void main(String[] args) {
        Student2 student = new Student2();

        int id = 1000;
        String name = "joy";
        int[] marks = {89, 34, 55, 66, 77};

        student.setstudent(id, name, marks);
        student.display(id, name, marks);
    }
}