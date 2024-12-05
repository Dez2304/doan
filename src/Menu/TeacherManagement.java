/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Menu.Teacher;
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
public class TeacherManagement {

    ArrayList<Teacher> teacherlist = new ArrayList<Teacher>();

    public TeacherManagement() {
    }

    public boolean KiemTraIDvaTen(Teacher tc) {
        DocFile();
        for (Teacher tc1 : teacherlist) {
            if (tc1.id == tc.id) {
                if (tc1.getName().equalsIgnoreCase(tc.getName())) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }


    public boolean KiemTraUser(Teacher tc) {
        DocFile();
        for (Teacher tclog : teacherlist) {
            if (tclog.getName().equalsIgnoreCase(tc.getName()) && tclog.id == tc.id) {
                return true;
            }

        }
        return false;
    }
    
    public void Registertc() {
        Teacher teacher = new Teacher();
        TeacherManagement tmt = new TeacherManagement();
        teacher.inputteacher();
        while (tmt.KiemTraIDvaTen(teacher)) {

            System.out.println("Teacher with this ID or Fullname already exists. Please enter a new ID or Fullname.");
            teacher.inputteacher();
        }

        teacherlist.add(teacher);
        System.out.println("Teacher registered successfully!");
    }
    
    public void Output() {
        for (Teacher tc : teacherlist) {
            System.out.println(tc);
        }
    }
    
    public void GhiFile(String filename) {
        try {
            File f = new File(filename);
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Teacher tc : teacherlist) {
                bw.write(tc.id + "\t" + tc.name);
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
            File f = new File("D:\\TKB\\Teacher.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] arr = line.trim().split("\t");
                Teacher tc = new Teacher(arr[1].trim(), Integer.parseInt(arr[0]));
                teacherlist.add(tc);
            }
            br.close();
            fr.close();
        } catch (Exception e) {

        }
    }

}
