package com.dubboDemo.producer.service.impl;

import com.dubboDemo.demo.entity.HelloDto;
import com.dubboDemo.demo.entity.HelloVo;
import com.dubboDemo.demo.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @date: 2022-04-13
 * @author: yangniuhaojiang
 * @title: HelloServiceImpl
 * @version: 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
@DubboService(version = "1.0.0", filter = {"producerFilter"})
public class HelloServiceImpl implements HelloService {
    @Override
    public HelloVo hello(HelloDto dto) {
        HelloVo helloVo = new HelloVo();
        helloVo.setHello("hello" + dto.getName());
        return helloVo;
    }
}
