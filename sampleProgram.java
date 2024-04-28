package collectionFramework.practice;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    Integer studentId;
    String studentName;
    String gender;
    String classroom;
    float average;

    Student() {
    }

    Student(Integer studentId, String studentName, String gender, String classroom, float average) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.classroom = classroom;
        this.average = average;
    }

    void insertStudent(Scanner scanner) {
        System.out.println("Enter Student ID : ");
        studentId = scanner.nextInt();
        System.out.println("Enter Student Name : ");
        studentName = scanner.next();
        System.out.println("Enter Gender : ");
        scanner.nextLine();
        gender = scanner.next();
        System.out.println("Enter Classroom : ");
        classroom = scanner.next();
        System.out.println("Enter average : ");
        scanner.nextLine();
        average = scanner.nextFloat();
    }

    void outputStudent() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Gender : " + gender);
        System.out.println("Classroom : " + classroom);
        System.out.println("Average : " + average);
    }

    void updateStudent(Scanner scanner) {
        System.out.println("Enter Student Name : ");
        studentName = scanner.next();
        System.out.println("Enter Gender : ");
        scanner.nextLine();
        gender = scanner.next();
        System.out.println("Enter Classroom : ");
        classroom = scanner.next();
        System.out.println("Enter average : ");
        scanner.nextLine();
        average = scanner.nextFloat();
    }

    public void deletedStudent(Scanner scanner) {
        System.out.println("Enter Student ID : ");
        studentId = scanner.nextInt();
    }
}

public class sampleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> allstudents = new ArrayList<>();
        int Option;
        do {
            System.out.println("1. Add New Studen");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Show All Students");
            System.out.println("5. Exit");
            System.out.println(">> Choose your Option(1-5): ");
            Option = scanner.nextInt();
            switch (Option) {
                case 1 -> {
                    System.out.println("----------- Add New Student -----------");
                    Student student = new Student();
                    student.insertStudent(scanner); // we get the object of student.
                    // add student to the list
                    allstudents.add(student);
                    System.out.println("Successfully for Add New Student!!");
                    System.out.println();
                }
                case 2 -> {
                    //id -> find student -> exist -> update
                    // student not exist -> there are not record
                    int updateId;
                    boolean isExisted = false;
                    System.out.println("********* Update Student *********");
                    updateId = scanner.nextInt();
                    for (int i = 0; i < allstudents.size(); i++) {
                        if (updateId == allstudents.get(i).studentId) {
                            isExisted = true;
                            // there is student wiht this updateId.
                            Student updateStudent = allstudents.get(i);
                            updateStudent.updateStudent(scanner);
                            allstudents.set(i, updateStudent);
                            System.out.println("Successfully Updte Student !!");
                        }
                    }
                    if (isExisted == false) {
                        System.out.println("Student with ID  " + updateId + " doesn't exist !!");
                    }

                }
                case 3 -> {
                    int deleteId;
                    boolean isExisted = false;
                    deleteId = scanner.nextInt();
                    System.out.println("********* Deleted Student *********");
                    for (int i = 0; i < allstudents.size(); i++) {
                        if (deleteId == allstudents.get(i).studentId) {
                            isExisted = true;
                            Student deletedStudent = new Student();
                            deletedStudent.deletedStudent(scanner);
                            allstudents.remove(i);
                            System.out.println("Successfully for deleted Student !!");
                        }
                        if (isExisted == false) {
                            System.out.println("The program does't delete because don't have record !!");
                        }
                    }
                }
                case 4 -> {
                    System.out.println("********* Show all Students *********");
                    for (Student outputStudent : allstudents) {
                        outputStudent.outputStudent();
                        System.out.println("-------------------------------------");
                    }
                }
                case 5 -> System.out.println("Exit the Program !!");
                default -> System.out.println("Please choose option again from (1-5)!!!");
            }
        } while (Option != 5);
    }
}
