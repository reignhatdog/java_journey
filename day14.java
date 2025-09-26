import java.util.LinkedList;
import java.util.Scanner;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class day14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> students = new LinkedList<>();

        while (true) {
            System.out.println(" Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Search Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    students.add(new Student(id, name));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\n--- Student List ---");
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = sc.nextInt();
                    boolean removed = false;
                    for (Student s : students) {
                        if (s.id == removeId) {
                            students.remove(s);
                            System.out.println("Student removed successfully!");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (Student s : students) {
                        if (s.id == searchId) {
                            System.out.println("Student Found: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
