package com.dubboDemo.producer.service.impl;

import com.dubboDemo.demo.entity.HelloDto;
import com.dubboDemo.demo.entity.HelloVo;
import com.dubboDemo.demo.service.HelloTwoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @date: 2022-04-13
 * @author: yangniuhaojiang
 * @title: HelloServiceImpl
 * @version: 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
@DubboService(version = "1.0.0", filter = {"producerFilter"})
public class HelloTwoServiceImpl implements HelloTwoService {
    @Override
    public HelloVo hello(HelloDto dto) {
        HelloVo helloVo = new HelloVo();
        helloVo.setHello("hello two" + dto.getName());
        return helloVo;
    }
}
