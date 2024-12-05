/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class StudentManagement {

    ArrayList<Student> studentlist = new ArrayList<Student>();

    public boolean KiemTraMSSVvaTen(Student st) {
        DocFile();
        for (Student st1 : studentlist) {
            if (st1.mssv == st.mssv) {
                if (st1.getName().equalsIgnoreCase(st.getName())) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean KiemTraUser(Student st) {
        DocFile();
        for (Student stlog : studentlist) {
            if (stlog.getName().equalsIgnoreCase(st.getName()) && stlog.mssv == st.mssv) {
                return true;
            }

        }
        return false;
    }
    
    public void Registerst() {

        Student student = new Student();
        student.input();
        StudentManagement smt = new StudentManagement();

        while (KiemTraMSSVvaTen(student)) {

            System.out.println("Student with this MSSV or Fullname already exists. Please enter a new MSSV or Fullname.");
            student.input();
        }

        studentlist.add(student);
        System.out.println("Student registered successfully!");
    }

    public void Output() {
        for (Student st : studentlist) {
            System.out.println(st);
        }
    }

    public void GhiFile(String filename) {
        try {
            File f = new File(filename);
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Student st : studentlist) {
                bw.write(st.mssv + "\t" + st.name);
                bw.newLine();
            }

            bw.close();
            fw.close();

        } catch (Exception e) {
            System.out.println("Can't run");
        }
    }

    public void DocFile() {
        try {
            File f = new File("D:\\TKB\\Student.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] arr = line.trim().split("\t");
                Student st = new Student(arr[1].trim(), Integer.parseInt(arr[0]));
                studentlist.add(st);
            }
            br.close();
            fr.close();
        } catch (Exception e) {

        }
    }
}
