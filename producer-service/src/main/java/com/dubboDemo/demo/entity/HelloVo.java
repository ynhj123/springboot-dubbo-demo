package com.dubboDemo.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @date: 2022-04-13
 * @author: yangniuhaojiang
 * @title: HelloVo
 * @version: 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
@Data
public class HelloVo implements Serializable {
    private String hello;
}
