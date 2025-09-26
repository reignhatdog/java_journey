//hash map


import java.util.*;

public class day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();

        while (true) {
            System.out.println("Student Management System (HashMap) ");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Search Student");
            System.out.println("5. Sort by ID");
            System.out.println("6. Sort by Name");
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

                    if (students.containsKey(id)) {
                        System.out.println("ID already exists! Student not added.");
                    } else {
                        students.put(id, name);
                        System.out.println("Student added successfully!");
                    }
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\n--- Student List ---");
                        for (Map.Entry<Integer, String> entry : students.entrySet()) {
                            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = sc.nextInt();
                    if (students.remove(removeId) != null) {
                        System.out.println("Student removed successfully!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();
                    if (students.containsKey(searchId)) {
                        System.out.println("Student Found: ID: " + searchId + ", Name: " + students.get(searchId));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    List<Map.Entry<Integer, String>> sortedById = new ArrayList<>(students.entrySet());
                    sortedById.sort(Map.Entry.comparingByKey());
                    System.out.println("\n--- Students Sorted by ID ---");
                    for (Map.Entry<Integer, String> entry : sortedById) {
                        System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
                    }
                    break;

                case 6:
                    List<Map.Entry<Integer, String>> sortedByName = new ArrayList<>(students.entrySet());
                    sortedByName.sort(Map.Entry.comparingByValue(String.CASE_INSENSITIVE_ORDER));
                    System.out.println("\n--- Students Sorted by Name ---");
                    for (Map.Entry<Integer, String> entry : sortedByName) {
                        System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
                    }
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
