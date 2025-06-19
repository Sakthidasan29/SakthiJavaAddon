package Day6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class MainTask {
    static ArrayList<String> studentNames = new ArrayList<>();
    static HashMap<Integer, List<String>> studentCourses = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course to Student");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Delete Course from Student");
            System.out.println("6. Save Courses to File");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> addCourse();
                case 3 -> searchStudent();
                case 4 -> deleteStudent();
                case 5 -> deleteCourse();
                case 6 -> saveToFile();
                case 7 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
    static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        studentNames.add(name);
        int id = studentNames.size() + 1;
        studentCourses.put(id, new ArrayList<>());
        System.out.println("Student added with ID: " + id);
    }
    static void addCourse() {
        System.out.print("Enter Course ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        if (!studentCourses.containsKey(id)) {
            System.out.println("Student ID not found.");
            return;
        }
System.out.print("Enter course name: ");
String course = scanner.nextLine();
studentCourses.get(id).add(course);
System.out.println("Course added to student.");
    }
    static void searchStudent() {
        System.out.print("Enter student name to search: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < studentNames.size(); i++) {
            if (studentNames.get(i).equalsIgnoreCase(name)) {
                System.out.println("Student ID: " + i);
                System.out.println("Courses: " + studentCourses.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }
    static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (id >= 0 && id < studentNames.size()) {
            System.out.println("Deleting student: " + studentNames.get(id));
            studentNames.set(id, "[DELETED]");
            studentCourses.remove(id);
            System.out.println("Student deleted.");
        } else {
            System.out.println("Invalid student ID.");
        }
    }
    static void deleteCourse() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (!studentCourses.containsKey(id)) {
            System.out.println("Student ID not found.");
            return;
        }
        System.out.print("Enter course name to delete: ");
        String course = scanner.nextLine();
        List<String> courses = studentCourses.get(id);
        if (courses.remove(course)) {
            System.out.println("Course removed.");
        } else {
            System.out.println("Course not found.");
        }
    }
    static void saveToFile() {
        try (FileWriter writer = new FileWriter("a.txt")) {
            for (Map.Entry<Integer, List<String>> entry : studentCourses.entrySet()) {
                String studentName = studentNames.get(entry.getKey());
                writer.write("ID: " + entry.getKey() + " | Name: " + studentName + " | Courses: " + entry.getValue() + "\n");
            }
            System.out.println("Data saved to a.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
