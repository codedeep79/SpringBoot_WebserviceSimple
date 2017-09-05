package com.trungnguyen.Dao;

import com.trungnguyen.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by NguyenTrungHau on 9/4/2017.
 */

//@Repository: dùng để đánh dấu các lớp DAO của Spring.
//        Mọi truy cập dữ liệu logic tới cơ sở dữ liệu cần phải đặt trong các lớp DAO.
@Repository
public class StudentDAO {
    private static Map<Integer, Student> students;

    // No return statements are supported.
    // No arguments are supported.
    // No this or super are supported.
    // Run only one time before the constructor or main method is called.
    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1,"Nguyen Trung Hau","Science Computer"));
                put(2, new Student(2,"Nguyen Thien Ngoc","Science Computer"));
                put(3, new Student(3,"Nguyen Thien Trung Hieu","Science Computer"));
                put(4, new Student(4,"Nguyen Thien Trung Bao","Science Computer"));
                put(5, new Student(5,"Nguyen Thien Bao Hoa","Science Computer"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        // Get List From HashMap
        return this.students.values();
    }

    public Student getStudentById(int id){
        return this.students.get(id);
    }

    public void removeStudentById(int id){
        this.students.remove(id);
    }

    public void updateStudentById(Student student){
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(s.getId(), student);
    }
}
