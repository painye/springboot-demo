package com.yp.springboot.ssm.service.impl;

import com.yp.springboot.ssm.entity.Student;
import com.yp.springboot.ssm.mapper.IStudentMapper;
import com.yp.springboot.ssm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional//事务管理
public class IStudentServiceImpl implements IStudentService {

    @Autowired//自动创建对象
    private IStudentMapper studentMapper;
    @Override
    public void addStudent(Student stu) {
        studentMapper.save(stu);
    }

    @Override
    public List<Student> selectAllByDept(String sdept) {
        return studentMapper.findAllByDept(sdept);
    }

    @Override
    public Student selectOne(String sname, String sno) {
        return studentMapper.findOne(sno, sname);
    }
}
