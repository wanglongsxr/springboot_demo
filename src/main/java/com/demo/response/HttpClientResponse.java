package com.demo.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @auther: wanglong
 * @date: 2022/3/14 10:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HttpClientResponse implements Serializable {
    private static final long serialVersionUID = 6647973013210201680L;
    /**
     * 响应状态码
     */
    private int code;

    /**
     * 响应数据
     */
    private String content;
}