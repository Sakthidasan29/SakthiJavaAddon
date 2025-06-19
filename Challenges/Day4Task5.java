package constructor;

import java.io.*;
import java.util.Scanner;

public class SimpleEmployeeCRUD {

    static final String FILE_NAME ="C:\Users\casstudent\Documents\wd"
    
    public static void addEmployee(String data) throws IOException {
        FileWriter fw = new FileWriter(FILE_NAME, true); 
        fw.write(data + "\n");
        fw.close();
        System.out.println("Employee added.");
    }
    public static void viewEmployees() throws IOException {
        File file = new File(FILE_NAME);

        if (!file.exists() || file.length() == 0) {
            System.out.println("No employee records found.");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
        String line;
        System.out.println("\nAll Employees:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
    public static void deleteEmployee(String id) throws IOException {
        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {
            if (!line.startsWith(id + ",")) {
                bw.write(line + "\n");
            } else {
                found = true;
            }
        }

        br.close();
        bw.close();

        if (found) {
            inputFile.delete();
            tempFile.renameTo(inputFile);
            System.out.println("Employee deleted.");
        } else {
            tempFile.delete();
            System.out.println("Employee ID not found.");
        }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Employee Record System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter ID,Name,Dept,Salary: ");
                    String data = sc.nextLine();
                    addEmployee(data);
                    break;

                case 2:
                    viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    String id = sc.nextLine();
                    deleteEmployee(id);
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
