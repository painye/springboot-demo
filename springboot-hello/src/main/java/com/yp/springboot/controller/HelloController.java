package com.yp.springboot.controller;


import com.yp.springboot.dto.HttpResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController //Controller+ResponseBody
@RequestMapping("/api/springboot")
public class HelloController {

    @GetMapping("/hello")
    public HttpResp hello(){
        return new HttpResp(20001, "spring查询成功", null, LocalDateTime.now());
    }
}
