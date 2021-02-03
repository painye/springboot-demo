package com.yp.springboot.ssm.mapper;

import com.yp.springboot.ssm.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper//这是一个接口
public interface IStudentMapper {
    int save(Student student);
    int alter(@Param("sno") String sno, @Param("sdept") String sdept);
    int delete(String sname);
    List<Student> findAllByDept(String sdept);
    Student findOne(@Param("sno") String sno, @Param("sname") String sname);
}
