package org.example.arrays_linkedlists.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager(1); // Array capacity of 1 student

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter student name to add: ");
                    String name = scanner.nextLine();
                    manager.addStudent(name);
                }
                case 2 -> {
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.nextLine();
                    manager.searchStudent(searchName);
                }
                case 3 -> {
                    System.out.print("Enter the index to delete: ");
                    int index = scanner.nextInt();
                    manager.deleteStudentAtIndex(index);
                }
                case 4 -> manager.displayStudents();
                case 5 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

