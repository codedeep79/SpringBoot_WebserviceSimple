package com.trungnguyen.Dao;

import com.trungnguyen.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by NguyenTrungHau on 9/6/2017.
 */

@Repository
@Qualifier("mongoDB")
public class MongoStudentDaoImpl implements StudentDAO {

    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(1,"Nguyen Trung Hau","Science Computer"));
                add(new Student(2,"Nguyen Thien Ngoc","Science Computer"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudent(Student student) {

    }
}
