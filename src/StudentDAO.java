public class StudentDAO {
    Node head, tail;
    Student student;

    private void push(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public Student createStudent(int id, String name, String grade) {
        Student student = new Student(id, name, grade);
        student.setId(id);
        push(student);
        return student;
    }

    public void remove() {

    }

    public void print() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            System.out.println("Current students of the list: ");
            do {
                System.out.println(" " + current.student);
                current = current.next;
            } while (current != head);
        }
    }

    public boolean searchById(int id) {
        Node current = head;
        if (head != null) {
            do {
                if (current.student.getId() == id) {
                    System.out.println("Student with id of: " + id);
                    System.out.println(" " + current.student);
                    return true;
                }
                current = current.next;
            } while (current != head);
        }
        return false;
    }

    public int getId() {
        return student.getId();
    }
}
