public class StudentDAO {
    Node head, tail;
    Student student;

    public void push(Student student) {
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

    public void remove(int id) {
        Node current = head;

        if(head != null) {
            if(current.student.getId() == id) {
                head = head.next;
                tail.next = head;
            } else {
                do {
                    Node nextNode = current.next;
                    if(nextNode.student.getId() == id) {
                        current.next = nextNode.next;
                        break;
                    }

                    current = current.next;
                } while (current != head);
            }
        }
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
            } while (current != head);
        }
        return false;
    }

    public int getId() {
        return student.getId();
    }
}
