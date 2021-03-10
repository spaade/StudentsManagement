import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        int option = 0;

        StudentDAO studentDAO =  new StudentDAO();
        String options = "\nStudents List Options\n"
                + "-----------------------------------------\n"
                + "0 - End\n"
                + "1 - Include student at the start\n"
                + "2 - Include student at the end\n"
                + "3 - Search student by id\n"
                + "4 - Remove student at the start\n"
                + "5 - Remove student at the end\n"
                + "6 - Remove student by id\n"
                + "7 - Print list";

        do {
            System.out.println(options);
            System.out.println("\n");
            System.out.print("Type your option --> ");
            option = read.nextInt();
            switch (option) {
                case 1:
                    Student student = studentBuilder();
                    studentDAO.push(student);
                    System.out.println("\n");
                    break;
                case 7:
                    studentDAO.print();
                    System.out.println("\n");
                    break;
            }
        } while (option != 0);

    }

    public static Student studentBuilder() {
        int id;
        String name, grade;

        System.out.println("\n");
        System.out.println("Enter student id: ");
        id = read.nextInt();
        System.out.print("id: " + id);
        System.out.println("\n");

        System.out.println("\nEnter student name: ");
        name = read.next();
        System.out.print("name: " + name);
        System.out.println("\n");

        System.out.println("\nEnter student grade: ");
        grade = read.next();
        System.out.print("grade: " + grade);

        return new Student(id, name, grade);
    }

}
