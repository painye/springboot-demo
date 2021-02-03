package com.yp.springboot.ssm.service.impl;

import com.yp.springboot.ssm.entity.Student;
import com.yp.springboot.ssm.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class IStudentServiceImplTest {
    @Autowired
    private IStudentService iss;
    @Test
    public void addStudent() {
//        Student stu= new Student();
//        stu.setSno("201215024");
//        stu.setName("玉皇大帝");
//        stu.setSex("男");
//        stu.setAge(10000);
//        stu.setDept("SX");
//        iss.addStudent(stu);
    }

    @Test
    public void selectAllByDept() {
        List<Student> mt = iss.selectAllByDept("MT");
        System.out.println(mt);
    }

    @Test
    public void selectOne() {
        Student student = iss.selectOne( "玉皇大帝","201215024");
        System.out.println(student);
    }
}