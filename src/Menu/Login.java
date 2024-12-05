/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;


import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Login {

    int chon;
    String press;

    public Login() {

    }

    public void MenuLogin() {

        Scanner sc = new Scanner(System.in);

        System.out.println("==== Login ====");
        System.out.println("1. Student");
        System.out.println("2. Teacher");
        System.out.print("Please choose (1-2): ");
        chon = sc.nextInt();
        sc.nextLine();
        switch (chon) {
            case 1: {
                System.out.println("==== Login ====");
                StudentManagement st = new StudentManagement();
                Loginst();
                break;
            }

            case 2: {
                System.out.println("==== Login ====");
                TeacherManagement tc = new TeacherManagement();
                Logintc();
                break;
            }

            default:
                System.out.println("==== Error ====");
                System.out.println("==== Try Again ====");
                break;
        }

    }

    public void MenuRegister() {

        Scanner sc = new Scanner(System.in);

        System.out.println("==== Register ====");
        System.out.println("1. Student");
        System.out.println("2. Teacher");
        System.out.print("Please choose (1-2): ");
        chon = sc.nextInt();
        sc.nextLine();
        switch (chon) {
            case 1: {
                System.out.println("==== Register ====");
                StudentManagement st = new StudentManagement();
                st.Registerst();
                st.GhiFile("D:\\TKB\\Student.txt");
                break;
            }

            case 2: {
                System.out.println("==== Register ====");
                TeacherManagement tc = new TeacherManagement();
                tc.Registertc();
                tc.GhiFile("D:\\TKB\\Teacher.txt");
                break;
            }

            default:
                System.out.println("==== Error ====");
                System.out.println("==== Try Again ====");
                break;
        }
    }

    public void Loginst() {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        StudentManagement smt = new StudentManagement();
        student.input();
        if (smt.KiemTraUser(student)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Fullname or MSSV is incorrect.");
            System.out.println();
            press = sc.nextLine();
            if (press.equalsIgnoreCase("n")) {
                System.out.println("Bạn đã chọn thoát. Hẹn gặp lại!");
                return ;
            }
        }

        student.input();
    }

    public void Logintc() {
        Teacher teacher = new Teacher();
        TeacherManagement tmt = new TeacherManagement();
        teacher.inputteacher();
        while (!tmt.KiemTraUser(teacher)) {
            System.out.println("Fullname or ID is incorrect.");
            teacher.inputteacher();
        }

        System.out.println("Login successful!");
    }
}
