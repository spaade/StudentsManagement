import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;

        StudentDAO studentDAO = new StudentDAO();
        String options = "\nStudents List Options\n"
                + "-----------------------------------------\n"
                + "0 - End\n"
                + "1 - Include student\n"
                + "2 - Search student by id\n"
                + "3 - Remove student by id\n"
                + "4 - Print list";

        do {
            int id;

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
                case 2:
                    System.out.println("Enter student id: ");
                    id = read.nextInt();
                    studentDAO.searchById(id);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Enter student id: ");
                    id = read.nextInt();
                    studentDAO.remove(id);
                    System.out.println("\n");
                case 4:
                    studentDAO.print();
                    System.out.println("\n");
                    break;
            }
        } while (option != 0);

    }

    public static Student studentBuilder() {
        int id = 0;
        String name, grade;

        StudentDAO studentDAO = new StudentDAO();

        System.out.println("\n");
        System.out.println("Enter student id: ");
        id = read.nextInt();
        if (studentDAO.searchById(id)) {
            System.out.println("Student id already registered. Try it again with a different id.");
            System.exit(0);
        }
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
