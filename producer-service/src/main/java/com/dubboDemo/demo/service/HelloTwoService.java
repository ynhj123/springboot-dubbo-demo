package com.dubboDemo.demo.service;

import com.dubboDemo.demo.entity.HelloDto;
import com.dubboDemo.demo.entity.HelloVo;

/**
 * @date: 2022-04-14
 * @author: yangniuhaojiang
 * @title: HelloTwoService
 * @version: 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
public interface HelloTwoService {
    HelloVo hello(HelloDto dto);
}
