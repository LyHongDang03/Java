package day5.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void getStudents() {
       for (Student student : students) {
           System.out.println(student);
       }
    }

    public Student findTopStudent() {
        Student topStudent = students.get(0);
        for (Student i : students) {
            if (i.getGrade() > topStudent.grade) {
                topStudent = i;
            }
        }
        return topStudent;
    }

    public int countExcellentStudents() {
        int count = 0;
        for (Student i : students) {
            if (i.check()) {
                count++;
            }
        }
        return count;
    }

    public boolean removeStudentById(int id) {
        for (Student i : students) {
            if (i.getId() == id) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }

    public Student getStudentById(int id) {
        for (Student i : students) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public void updateStudent(int id, int grade, String name, int age) {
        for (Student i : students) {
            if (i.getId() == id) {
                i.setName(name);
                i.setAge(age);
                i.setGrade(grade);
                System.out.println("Cập nhật thành công");
                break;
            }
        }
    }

    public void sortStudents() {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students.get(i).id > students.get(j).id) {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
        getStudents();
    }
}
