//hash set


import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return id == s.id; // uniqueness based on ID
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); 
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Student> students = new HashSet<>();

        while (true) {
            System.out.println("Student Management System (HashSet)");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Search Student");
            System.out.println("5. Sort Students by ID");
            System.out.println("6. Sort Students by Name");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    if (students.add(new Student(id, name))) {
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Duplicate ID! Student already exists.");
                    }
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
                    boolean removed = students.removeIf(s -> s.id == removeId);
                    if (removed) {
                        System.out.println("Student removed successfully!");
                    } else {
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
                    List<Student> sortedById = new ArrayList<>(students);
                    sortedById.sort(Comparator.comparingInt(s -> s.id));
                    System.out.println("\n--- Students Sorted by ID ---");
                    sortedById.forEach(System.out::println);
                    break;

                case 6:
                    List<Student> sortedByName = new ArrayList<>(students);
                    sortedByName.sort(Comparator.comparing(s -> s.name.toLowerCase()));
                    System.out.println("\n--- Students Sorted by Name ---");
                    sortedByName.forEach(System.out::println);
                    break;

                case 7:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}

