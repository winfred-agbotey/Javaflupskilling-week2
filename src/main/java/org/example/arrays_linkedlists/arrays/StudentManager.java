package org.example.arrays_linkedlists.arrays;

public class StudentManager {
    private String[] students;
    private int count;

    public StudentManager(int length) {
        students = new String[length];
    }


    /*Add new student*/
    public void addStudent(String name) {
        if (students.length == count) {
            String[] temp = new String[count + 1];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[count++] = name;
    }

    /*Search student by name*/
    public void searchStudent(String studentName) {
        // If the list is empty, display a message and return
        if (count == 0) {
            System.out.println("Student List is empty.");
            return;
        }

        boolean found = false; // Flag to track if the student is found
        for (int i = 0; i < count; i++) {
            if (students[i] != null && students[i].equalsIgnoreCase(studentName)) {
                System.out.println("Student with name " + studentName + " is at index " + i);
                found = true;
                break; // Student found, exit the loop
            }
        }

        // If no student was found
        if (!found) {
            System.out.println("No student found with the name " + studentName);
        }

    }

    /*Delete student by index*/
    public void deleteStudentAtIndex(int index) {
        //validate the index
        if (index < 0 || index >= count) {
            System.out.println("Invalid index");
            return;
        }
        // remove a student at a specific index
        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }
        count--;
        System.out.println("Student deleted successfully...");
    }

    /*Display students*/
    public void displayStudents() {
        if (count == 0) {
            System.out.println("No students in the list.");
            return;
        }
        System.out.println("List of students: ");
        for (String student : students) {
            System.out.println(student);
        }
    }

}
