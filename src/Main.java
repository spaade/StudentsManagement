public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO =  new StudentDAO();

        studentDAO.createStudent(1, "Gustavo", "ADS");
        studentDAO.createStudent(2, "Gustavo1", "ADS");
        studentDAO.createStudent(3, "Gustavo2", "ADS");

        studentDAO.print();
        studentDAO.searchById(2);
    }


}
