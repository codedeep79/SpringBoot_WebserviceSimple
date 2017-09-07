package com.trungnguyen.Dao;

import com.trungnguyen.Entity.Student;

import java.util.Collection;

/**
 * Created by NguyenTrungHau on 9/6/2017.
 */
public interface StudentDAO {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
