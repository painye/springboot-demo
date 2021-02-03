package com.yp.springboot.ssm.service;

import com.yp.springboot.ssm.entity.Student;

import java.util.List;

public interface IStudentService {
    void addStudent(Student stu);
    List<Student> selectAllByDept(String sdept);
    Student selectOne(String sname, String sno);
}
