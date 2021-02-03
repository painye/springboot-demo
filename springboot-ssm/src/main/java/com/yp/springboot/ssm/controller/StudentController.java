package com.yp.springboot.ssm.controller;

import com.yp.springboot.ssm.dto.HttpResp;
import com.yp.springboot.ssm.entity.Student;
import com.yp.springboot.ssm.service.IStudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/student")
@Api(tags = "student测试")
public class StudentController {
    @Autowired
    private IStudentService isc;

    @ApiOperation(value = "注册")
    @PutMapping("/addStudent.do")
    public HttpResp addStudent(Student stu){
        //调用service
        isc.addStudent(stu);
        HttpResp httpResp=new HttpResp(30001, "添加成功", stu, LocalDateTime.now());
        return httpResp;
    }

    @ApiOperation(value = "通过系查询学生")
    @GetMapping("/findAllByDept.do")
    public HttpResp findAllByDept(String dept){
        List<Student> students = isc.selectAllByDept(dept);
        return new HttpResp(3001, "查找成功", students, LocalDateTime.now());
    }
    @ApiOperation(value = "登录查询学生")
    @GetMapping("/selectOne.do")
    public HttpResp selectOne(String name, String sno){
        Student student = isc.selectOne(name, sno);
        return new HttpResp(3001, "登陆成功", student, LocalDateTime.now());
    }
}