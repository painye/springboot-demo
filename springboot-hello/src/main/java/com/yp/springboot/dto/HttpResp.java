package com.yp.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * 用来包装返回数据的类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HttpResp {
    private int code;
    private String msg;
    private Object results;
    private LocalDateTime time;
}
