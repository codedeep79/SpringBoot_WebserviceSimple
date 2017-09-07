package com.trungnguyen.Controller;

import com.trungnguyen.Entity.Student;
import com.trungnguyen.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

/**
 * Created by NguyenTrungHau on 9/4/2017.
 */

// Webservice controller
@RestController
@RequestMapping("/students")
public class StudentController {
    // Tự động liên kết các bean được sử dụng trong các class với các bean được Spring Container sinh ra và quản lý.
    // Không cần khởi tạo đối tượng
    @Autowired
    private StudentServices studentServices;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return this.studentServices.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return this.studentServices.getStudentById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removeStudentById(@PathVariable("id") int id){
        this.studentServices.removeStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student student){
        this.studentServices.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student){
        this.studentServices.insertStudent(student);
    }
}
