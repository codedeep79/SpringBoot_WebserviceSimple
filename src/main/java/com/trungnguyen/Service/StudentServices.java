package com.trungnguyen.Service;

import com.trungnguyen.Dao.StudentDAO;
import com.trungnguyen.Dao.StudentDAOImpl;
import com.trungnguyen.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by NguyenTrungHau on 9/4/2017.
 */

@Service
public class StudentServices {
    // Tự động liên kết các bean được sử dụng trong các class với các bean được Spring Container sinh ra và quản lý.
    // Không cần khởi tạo đối tượng
    @Autowired
    @Qualifier("mongoDB")
    private StudentDAO studentDAO;

    public Collection<Student> getAllStudents(){
        return this.studentDAO.getAllStudents();
    }
    public Student getStudentById(int id){
        return this.studentDAO.getStudentById(id);
    }

    public void removeStudentById(int id){
        this.studentDAO.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.studentDAO.updateStudent(student);
    }

    public void insertStudent(Student student){
        this.studentDAO.insertStudent(student);
    }
}
