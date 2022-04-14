package com.dubboDemo.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @date: 2022-04-13
 * @author: yangniuhaojiang
 * @title: HelloDto
 * @version: 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
@Data
public class HelloDto implements Serializable {
    private String name;
}
